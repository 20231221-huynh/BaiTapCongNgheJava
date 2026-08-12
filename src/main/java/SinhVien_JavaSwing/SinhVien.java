
package SinhVien_JavaSwing;

public class SinhVien {
    private String id;
    private String name;
    private String lop;
    
    public SinhVien(String id, String name, String lop){
        this.id = id;
        this.name = name;
        this.lop = lop;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLop() {
        return lop;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    
}
