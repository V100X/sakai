package org.sakaiproject.scorm.model.api;

import java.util.LinkedList;
import java.util.List;

public class CMIFieldGroup {

	private Long id;
	private long contentPackageId;
	private List<CMIField> list;

	public CMIFieldGroup() { 
		this.list = new LinkedList<CMIField>();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public List<CMIField> getList() {
		return list;
	}

	public void setList(List<CMIField> list) {
		this.list = list;
	}

	public long getContentPackageId() {
		return contentPackageId;
	}

	public void setContentPackageId(long contentPackageId) {
		this.contentPackageId = contentPackageId;
	}

	@Override
    public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + ((id == null) ? 0 : id.hashCode());
	    return result;
    }

	@Override
    public boolean equals(Object obj) {
	    if (this == obj)
		    return true;
	    if (obj == null)
		    return false;
	    if (getClass() != obj.getClass())
		    return false;
	    CMIFieldGroup other = (CMIFieldGroup) obj;
	    if (id == null) {
		    if (other.id != null)
			    return false;
	    } else if (!id.equals(other.id))
		    return false;
	    return true;
    }
	
}
