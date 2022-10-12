package com.sh.collection.list.music.model.vo;

import java.util.Objects;

public class Music implements Comparable<Music>{
	private String title;
	private String singer;
	
	public Music() {}

	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return this.singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return this.title + "\t\t" + this.singer;
	}

	@Override
	public int compareTo(Music other) {
		return this.singer.compareTo(other.singer);
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.singer, this.title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Music other = (Music) obj;
		if (this.singer == null) {
			if (other.singer != null)
				return false;
		} else if (!this.singer.equals(other.singer))
			return false;
		if (this.title == null) {
			if (other.title != null)
				return false;
		} else if (!this.title.equals(other.title))
			return false;
		return true;
	}
	
	
	
}
