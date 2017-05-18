package test.exam;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LogService {

	// 1번
	// private Log log= LogFactory.getLog(getClass());
	private Log log = LogFactory.getLog(LogService.class);

	/** 로그기록 남기기 */
	public void logginTest() {
		log.trace("trace 관련된 message 입니다.");
		log.debug("trace 관련된 message 입니다.");
		log.info("trace 관련된 message 입니다.");
		log.warn("trace 관련된 message 입니다.");
		log.error("trace 관련된 message 입니다.");
		log.fatal("trace 관련된 message 입니다.");
	}

}
