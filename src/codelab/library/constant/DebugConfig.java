package codelab.library.constant;


/**
 * 디버깅 관련 상수 모음.

 * @author arngard
 *
 */
public class DebugConfig {
	
	/*
	 * 이 클래스의 정의를 할 때 {@link CommonConfig#getVersionConfig()}를 고려할 것.
	 * */

	/** 로그캣 태그 */
	public static final String	LOG_TAG						= "codelab.library";

	/** 고의로 로딩 시간에 딜레이를 더 준다. */
	public static final int		LOAD_TIME_ADD_MILLIS		= CommonConfig.getVersionConfig() < 0 ? 500 : 0;

	/**
	 * 로그캣에 출력을 할지를 얻어온다.
	 * @return 로그캣에 출력을 할지
	 */
	public static boolean isShowLogCat() {
		return CommonConfig.getVersionConfig() < 0 ? true : false;
	}

}