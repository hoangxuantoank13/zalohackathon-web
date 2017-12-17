include "jzoasendmsg.thrift"

namespace java com.vng.zing.jzoasendmsg.thrift

service OASendMWService {
	i32 ping();
	i64 sendReview(1:i32 toUserId, 2:jzoasendmsg.TOASendGif msg);
}