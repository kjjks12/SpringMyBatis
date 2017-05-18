package kosta.test.advice;

import java.io.Closeable;
import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

@Service
@Aspect
public class LogAdvice {

	@Around("PointCutClass.pointCut()")
	public Object around(ProceedingJoinPoint joinPoint) {

		// 사전
		String methodName = joinPoint.getSignature().getName();
		// String methodName2= joinPoint.getSignature().toShortString();
		StopWatch sw = new StopWatch();
		sw.start();

		Object obj = null;
		try {
			obj = joinPoint.proceed();
		} catch (Throwable e1) {
			e1.printStackTrace();
		}
		sw.stop();
		// 사후

		String result = methodName + "호출 /" + " 인수개수 :" + joinPoint.getArgs().length + "개 / 리턴 값 :" + obj + " /총 실행시간 :"
				+ sw.getTotalTimeMillis() + "ms";
		// System.out.println(result);

		Log log = LogFactory.getLog(LogAdvice.class);

		/** 로그기록 남기기 */
/*		log.trace("trace 관련된 message 입니다.");
		log.debug("trace 관련된 message 입니다.");
		log.info("trace 관련된 message 입니다.");
		log.warn("trace 관련된 message 입니다.");
		log.error("trace 관련된 message 입니다.");
		log.fatal("trace 관련된 message 입니다.");*/
		
		log.info(result);

		/*FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("result.txt", true); // 절대주소 경로 가능
			bw = new BufferedWriter(fw);

			bw.write(result);
			bw.newLine(); // 줄바꿈
			bw.newLine(); // 줄바꿈

		} catch (IOException e) {
			System.err.println(e); // 에러가 있다면 메시지 출력
			System.exit(1);
		} finally {
			closeMethod(bw, fw);
		}*/

		return obj;

	}

	public static void closeMethod(Closeable... closes) {
		for (Closeable c : closes) {
			try {
				c.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
