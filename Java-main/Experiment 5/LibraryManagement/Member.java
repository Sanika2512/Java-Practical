package LibraryManagement;

public class Member {
    private String name;
    private String memberId;
    private String email;

    public Member(String name, String memberId, String email) {
        this.name = name;
        this.memberId = memberId;
        this.email = email;
    }

    // Getters
    public String getName() { return name; }
    public String getMemberId() { return memberId; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return "Member [Name: " + name + ", ID: " + memberId + ", Email: " + email + "]";
    }
}
