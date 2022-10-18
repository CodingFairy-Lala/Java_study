package contents.resources.loginsystem;

import java.io.Serializable;
import java.util.Objects;

import contents.resources.character.Bear;

public class User implements Serializable {

	private static final long serialVersionUID = 1L; // serialVersionUID 값 지정

	private String id;
	private String password;
	private String nickname;
	public boolean bearOwner;
	private Bear myBear;

	public User() {
	}

	public User(String id, String password, String nickname) {
		this.id = id;
		this.password = password;
		this.nickname = nickname;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public boolean getBearOwner() {
		return this.bearOwner;
	}

	public void setMyBear(Bear myBear) {
		this.myBear = myBear;
	}

	public Bear getMyBear() {
		return this.myBear;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof User)) {
			return false;
		}
		User user = (User) o;
		return Objects.equals(id, user.id) && Objects.equals(password, user.password)
				&& Objects.equals(nickname, user.nickname) && bearOwner == user.bearOwner;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, password, nickname, bearOwner);
	}

	@Override
	public String toString() {
		return "{" +
				" id='" + this.getId() + "'" +
				", password='" + this.getPassword() + "'" +
				", nickname='" + this.getNickname() + "'" +
				", bearOwner='" + this.getBearOwner() + "'" +
				"}";
	}

	public boolean isBearOwner(boolean b) {
		return this.bearOwner = b;
	}

}

// - [ ] 로그인
// - 회원가입 (아디, 비번, 이름 입력) + 곰돌이 분양받기 (곰돌이 이름, 성별 입력)
// - 아이디 조회 (회원 이름 입력하고 아이디 조회하기)
// - 비밀번호 변경
// - 곰돌이 정보 수정 (이름, 성별 등)
// - 회원 정보파일 / 곰돌이 정보파일 입출력 - 회원가입했을때 아이디, 비번, 이름 파일을 하나 생성 / 만약 비번변경시 이 파일의
// 비밀번호 변경
