package optional;

public class Student {
    private long enrollment;
    private String name;
    private String branch;

    public Student(){}

    public Student(long enrollment, String name, String branch) {
        this.enrollment = enrollment;
        this.name = name;
        this.branch = branch;
    }

    public long getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(long enrollment) {
        this.enrollment = enrollment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
