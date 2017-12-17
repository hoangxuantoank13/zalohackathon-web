namespace java com.vng.zing.jzoasendmsg.thrift

struct TLocationCondition {
	1: optional double lat,
	2: optional double lon,
	3: optional i32 radius, // in m
}

struct TOASendFilter {
	1: optional bool gender, // true: male
	2: optional i32 fromAge,
	3: optional i32 toAge,
	4: optional TLocationCondition locate,
}

struct TOASendGif {
	1: optional i32 oaId,
	2: optional string href,
	3: optional string thumb,
	4: optional string url,
	5: optional string msg,
	6: optional i32 width,
	7: optional i32 height,
	8: optional bool isOutBox,
	9: optional bool isNotify,
	10: optional TOASendFilter filter
}

struct TGuggyMessage {
	1: optional string message,
	2: optional i32 oaId,
	3: optional i32 userId,
}
