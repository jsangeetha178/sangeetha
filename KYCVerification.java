package p1;

public class KYCVerification {
	private String pannumber;
	private Long aadharnumber;
	private String documenttype;
	private String documentnumber;
	
	
	public KYCVerification(String pannumber, Long aadharnumber, String documenttype, String documentnumber) {
		super();
		this.pannumber = pannumber;
		this.aadharnumber = aadharnumber;
		this.documenttype = documenttype;
		this.documentnumber = documentnumber;
	}
	public KYCVerification() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPannumber() {
		return pannumber;
	}
	public void setPannumber(String pannumber) {
		this.pannumber = pannumber;
	}
	public Long getAadharnumber() {
		return aadharnumber;
	}
	public void setAadharnumber(Long aadharnumber) {
		this.aadharnumber = aadharnumber;
	}
	public String getDocumenttype() {
		return documenttype;
	}
	public void setDocumenttype(String documenttype) {
		this.documenttype = documenttype;
	}
	public String getDocumentnumber() {
		return documentnumber;
	}
	public void setDocumentnumber(String documentnumber) {
		this.documentnumber = documentnumber;
	}
	@Override
	public String toString() {
		return "KYCVerification [pannumber=" + pannumber + ", aadharnumber=" + aadharnumber + ", documenttype="
				+ documenttype + ", documentnumber=" + documentnumber + "]";
	}
	
	

}
