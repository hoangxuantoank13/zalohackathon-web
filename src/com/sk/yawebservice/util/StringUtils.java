package com.sk.yawebservice.util;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang.exception.NestableRuntimeException;

public class StringUtils {

	private static final String EMPTY_STRING = "";

	public static String join(CharSequence separator, Iterable strings) {
		StringBuilder sb = new StringBuilder();
		boolean first = true;
		for (Object s : strings) {
			if (!first) {
				sb.append(separator);
			} else {
				first = false;
			}
			sb.append(s);
		}
		return sb.toString();
	}

	public static String join(CharSequence separator, Map<String, String> map) {
		StringBuilder sb = new StringBuilder();
		boolean first = true;
		for (String key : map.keySet()) {
			if (!first) {
				sb.append(separator);
			} else {
				String value = map.get(key);
				sb.append(key);
				sb.append("=");
				sb.append(value);
			}
		}
		return sb.toString();
	}

	public static String join(CharSequence separator, Object[] objects) {
		StringBuilder sb = new StringBuilder();
		boolean first = true;
		for (Object s : objects) {
			if (!first) {
				sb.append(separator);
			} else {
				first = false;
			}
			sb.append(s);
		}
		return sb.toString();
	}

	public static List<Integer> toListInteger(String str, String delimiter) {
		List<Integer> tokens = new ArrayList<>();
		if (str == null) {
			return tokens;
		}

		StringTokenizer st = new StringTokenizer(str, delimiter);
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			token = token.trim();
			//allow token even it is empty
			tokens.add(Integer.parseInt(token));
		}
		return tokens;
	}

	public static List<String> toList(String str, String delimiter) {
		List<String> tokens = new ArrayList<String>();
		if (str == null) {
			return tokens;
		}

		StringTokenizer st = new StringTokenizer(str, delimiter);

		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			token = token.trim();
			//allow token even it is empty
			tokens.add(token);
		}
		return tokens;
	}

	public static boolean isEmpty(String str) {
		return (str == null || str.length() == 0);
	}

	public static boolean hasText(String str) {
		if (isEmpty(str)) {
			return false;
		}
		int strLen = str.length();
		for (int i = 0; i < strLen; i++) {
			if (!Character.isWhitespace(str.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	public static String changeWhitespaceToUnderscore(String str) {
		StringBuilder strResult = new StringBuilder();
		int strLen = str.length();
		for (int i = 0; i < strLen; i++) {
			char charInStr = str.charAt(i);
			if (Character.isWhitespace(str.charAt(i))) {
				charInStr = '_';
			}
			strResult.append(charInStr);

		}
		return strResult.toString();
	}

	public static String snippet(String s, int length, String tail) {
		if (s.length() <= length) {
			return s;
		}
		String subString = s.substring(0, length);
		int lastEmptyIndex = subString.lastIndexOf(EMPTY_STRING);
		subString = subString.substring(0, lastEmptyIndex);
		if (hasText(tail)) {
			subString += " " + tail;
		}
		return subString;
	}

	public static String toUTF8String(String unicode) {
		return toUTF8String(unicode, false);
	}

	public static String toUTF8String(String unicode, boolean withQuote) {
		if (unicode != null) {
			StringBuilder output = new StringBuilder();

			if (withQuote) {
				output.append("\"");
			}

			char[] charArray = unicode.toCharArray();

			for (int i = 0; i < charArray.length; ++i) {
				char a = charArray[i];
				if (a > 0x007F) {
					if ((a & 0xFF00) == 0) {
						output.append("\\u00" + Integer.toHexString(a));
					} else if ((a & 0xF000) == 0) {
						output.append("\\u0" + Integer.toHexString(a));
					} else {
						output.append("\\u" + Integer.toHexString(a));
					}
				} else {
					output.append(a);
				}
			}

			if (withQuote) {
				output.append("\"");
			}

			return output.toString();
		}

		return "";
	}

	public static String fromUTF8String(String escapedUtf8Str) {
		if (hasText(escapedUtf8Str)) {
			StringBuilder output = new StringBuilder();

			char[] charArray = escapedUtf8Str.toCharArray();

			for (int i = 0; i < charArray.length; ++i) {
				char a = charArray[i];
				if (a == '\\' && i < charArray.length - 5) {
					char b = charArray[i + 1];
					if (b == 'u') {
						String hex = charArray[i + 2] + "" + charArray[i + 3]
								+ charArray[i + 4] + charArray[i + 5];
						int intValue = Integer.parseInt(hex, 16);
						output.append((char) intValue);
						i = i + 5;
					}
				} else {
					output.append(a);
				}
			}

			return output.toString();
		}

		return "";
	}

	public static String unescapeString(String str) {
		if (!hasText(str)) {
			return str;
		}
		int stringSize = str.length();
		boolean hasSlash = false;
		boolean inUnicode = false;
		StringBuffer unicode = new StringBuffer(4);
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < stringSize; i++) {
			char ch = str.charAt(i);
			if (inUnicode) {
				unicode.append(ch);
				if (unicode.length() == 4) {
					try {
						int value = Integer.parseInt(unicode.toString(), 16);
						unicode.setLength(0);
						inUnicode = false;
						hasSlash = false;
						output.append((char) value);
					} catch (NumberFormatException nfe) {
						throw new NestableRuntimeException("Unable to parse unicode value: " + unicode, nfe);
					}
				}
				continue;
			}
			if (hasSlash) {
				hasSlash = false;
				switch (ch) {
					case '\\':
						output.append('\\');
						break;
					case '\'':
						output.append('\'');
						break;
					case '\"':
						output.append('"');
						break;
					case 'r':
						output.append('\r');
						break;
					case 'f':
						output.append('\f');
						break;
					case 't':
						output.append('\t');
						break;
					case 'n':
						output.append('\n');
						break;
					case 'b':
						output.append('\b');
						break;
					case 'u': {
						inUnicode = true;
						break;
					}
					default:
						output.append(ch);
						break;
				}
				continue;
			} else if (ch == '\\') {
				hasSlash = true;
				continue;
			}
			output.append(ch);

		}
		return output.toString();
	}

	public static String removeAccent(String s) {

		String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		String data = pattern.matcher(temp).replaceAll("");
		return data.toLowerCase();
	}

	public static String removeAccent1(String str) {
		Pattern DIACRITICS_AND_FRIENDS = Pattern.compile(
				"[\\p{InCombiningDiacriticalMarks}\\p{IsLm}\\p{IsSk}]+");
		str = Normalizer.normalize(str, Normalizer.Form.NFD);
		str = DIACRITICS_AND_FRIENDS.matcher(str).replaceAll("");
		return str;

	}

	public static String wrapWord(String word, int numChar) {
		int lenWord = word.length();
		if (lenWord > numChar) {
			StringBuilder result = new StringBuilder();
			int pos = 0;
			while (true) {
				if (pos + numChar >= lenWord) {
					result.append(word.substring(pos, lenWord));
					break;
				} else {
					result.append(word.substring(pos, pos + numChar));
					result.append(" ");
					pos = pos + numChar;
				}
			}
			return result.toString();
		}
		return word;
	}

	public static String convertListToStringWithComma(List<Integer> list) {
		String result = "";
		if (list != null) {
			for (int member : list) {
				if ("".equals(result)) {
					result = member + "";
				} else {
					result += ";" + member;
				}
			}
		}
		return result;
	}

	public static String stripTags(String text, String allowed, boolean removeMultiBr) {
		if (removeMultiBr) {
			text = text.replaceAll("/(<br[^>]*>\\s*)+/i", "<br/>");
		}
		return strip_tags(text, allowed);
	}

	public static String strip_tags(String text, String allow) {
		if (text == null || text.isEmpty()) {
			return "";
		}
		Pattern p = Pattern.compile("<[/!]?([^\\s>]*)\\s*[^>]*>", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(text);
		String[] tagList = {};
		List<String> allowTag = new ArrayList<String>();
		if (allow != null && !allow.isEmpty()) {
			tagList = allow.split(",");
			allowTag = Arrays.asList(tagList);
		}
		StringBuilder result = new StringBuilder("");
		int pos = 0;

		while (m.find()) {
			String tagContent = m.group(1).trim();
			String tagName = tagContent.split(" ")[0];
			if (allowTag.size() > 0) {
				if (allowTag.contains(tagName)) {
					result.append(text.substring(pos, m.end()) + " ");

				} else {
					result.append(text.substring(pos, m.start()) + " ");
				}
			} else {
				result.append(text.substring(pos, m.start()) + " ");
			}
			pos = m.end();
		}
		if (pos == 0) {
			return text;
		} else if (pos < text.length()) {
			result.append(text.substring(pos));
		}
		return result.toString().trim();
	}

	public static boolean compareListIntegerSameChild(List<Integer> lst1, List<Integer> lst2) {
		boolean isMatch = true;
		for (int i = 0; i < lst1.size(); i++) {
			if (lst1.get(i).compareTo(lst2.get(i)) != 0) {
				return false;
			}
		}
		return isMatch;
	}

	public static void main(String[] args) {
//		System.out.println();
//		org.apache.commons.lang.StringUtils.str

//		String input = "Đậu Đỏ Tung Tăng 1";
		
// first encode the utf-16 string as a ByteBuffer
//		ByteBuffer bb = Charset.forName("utf-16").encode(CharBuffer.wrap(input));
// then decode those bytes as US-ASCII
//		CharBuffer ascii = Charset.forName("US-ASCII").decode(bb);
//		System.out.println(ascii.toString());
//		StringUtils.stripAccents("Đậu Đỏ Tung Tăng 1");
		System.out.println(StringUtils.removeAccent1("Đậu Đỏ Tung Tăng 1"));
	}
}
