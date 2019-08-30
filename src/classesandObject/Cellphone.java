package classesandObject;

public class Cellphone {
    private String cellphoneType;
    private String getCellphoneName;

    public Cellphone(String cellphoneType, String getCellphoneName) {
        this.cellphoneType = cellphoneType;
        this.getCellphoneName = getCellphoneName;
    }

    public String getCellphoneType() {
        return cellphoneType;
    }

    public void setCellphoneType(String cellphoneType) {
        this.cellphoneType = cellphoneType;
    }

    public String getGetCellphoneName() {
        return getCellphoneName;
    }

    public void setGetCellphoneName(String getCellphoneName) {
        this.getCellphoneName = getCellphoneName;
    }
}
