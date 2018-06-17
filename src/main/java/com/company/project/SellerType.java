package com.company.project;

public enum SellerType {
    TAOBAO(1001,"淘宝市场"),
    TMALL(1002,"天猫市场"),
    TMALLMARKET(1003,"天猫超市"),
    TMALLINTERNATIONAL(1004,"天猫国际"),
    TMALLGLOBAL(1005,"全球购");

    int code;
    String value;

    SellerType(int code, String value) {
        this.code = code;
        this.value = value;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static SellerType codeOf(int code){
        for (SellerType sellerType: values()){
            if (sellerType.getCode()==code){
                return sellerType;
            }
        }
        throw new RuntimeException("没有找到相应的类型");
    }
}
