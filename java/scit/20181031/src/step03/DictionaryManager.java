package step03;

import java.util.HashMap;

public class DictionaryManager {
	// 파라미터의 단어와 설명글을 이용해서 List, Map, Set을 선택해서 생성하고 추가
	// Map : 단어를 key 설명글을 value
	// List : value를 하나로 만들 수 밖에 없지만, 속성값 두개를 가진 클래스
	// Set : 중복되지 않는 형태로 생성
	HashMap<String, String> dictionary = new HashMap();

	public void addWord(String word, String description) {
		// 추가되면, "라는 단어를 등록했습니다."
		// 중복되지 않도록! 중복된다면, "등록되어 있는 단어입니다."라고
		if (dictionary.get(word) == null ) {
			dictionary.put(word, description);
			System.out.println(word + "라는 단어를 등록했습니다.");
		} else {
			System.out.println("등록되어 있는 단어입니다.");
		}
	}

	public String searchWord(String word) {
		// 파라미터의 단어를 이용해서 "단어 : 설명글"
		// 존재하지 않는 경우, "등록되지 않은 단어입니다."
		String description = "";
		if (dictionary.get(word) == null ) {
			description = "등록되지 않은 단어입니다.";
		} else {
			description = word + " : " + dictionary.get(word);
		}
		return description;
	}

	public boolean deleteWord(String word) {
		// 파라미터의 단어를 이용해서 삭제 true
		// 존재하지 않는 경우 false
		boolean result;
		if (dictionary.remove(word) == null ) {
			result = false;
		} else {
			result = true;
		}
		return result;
	}
}