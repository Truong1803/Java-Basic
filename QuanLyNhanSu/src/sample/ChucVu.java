package sample;

public class ChucVu {
    private String Pos;
    private Double Coe_Salary;
    public ChucVu(){
        Pos = "";
        Coe_Salary=0.0;
    }
    public ChucVu(String position) {
        Pos = position;
        switch (position){
            case "Nhân viên":
                Coe_Salary = 5.0;
                break;
            case "Thư ký":
                Coe_Salary = 5.5;
                break;
            case "Quản lý":
                Coe_Salary = 6.0;
                break;
            case "Giám đốc":
                Coe_Salary = 10.0;
                break;
            default:
                Coe_Salary = 0.0;
        }
    }

    public String getPosition() {
        return Pos;
    }

    public void setPosition(String position) {
        Pos = position;
        switch (position) {
            case "Nhân viên":
                Coe_Salary = 5.0;
                break;
            case "Thư ký":
                Coe_Salary = 5.5;
                break;
            case "Quản lý":
                Coe_Salary = 6.0;
                break;
            case "Giám đốc":
                Coe_Salary = 10.0;
                break;
            case "Bảo vệ":
                Coe_Salary = 4.0;
            default:
                Coe_Salary = 0.0;
        }
    }
    public Double getCoe_Salary() {
        return Coe_Salary;
    }
}
