package com.saint.wechat.pojo;
/**
 * 
 * @author zad
 *
 */
public class VoiceMessage extends BaseMessage{
	private Voice Voice;

	public Voice getVoice() {
		return Voice;
	}

	public void setVoice(Voice voice) {
		Voice = voice;
	}
}