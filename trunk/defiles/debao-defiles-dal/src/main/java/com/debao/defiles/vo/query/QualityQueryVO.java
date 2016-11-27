package com.debao.defiles.vo.query;

import com.debao.defiles.common.Paginator;
import com.debao.defiles.vo.QualityVO;

public class QualityQueryVO extends QualityVO {
	
	private Paginator paginator;
	
	private String keyword;
	
	private String extrasort;

	public Paginator getPaginator() {
		return paginator;
	}

	public void setPaginator(Paginator paginator) {
		this.paginator = paginator;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getExtrasort() {
		return extrasort;
	}

	public void setExtrasort(String extrasort) {
		this.extrasort = extrasort;
	}
	
}
