package Lab6;

public class Customer implements CanPay {
    private String name;
    private MemberType memberType;

    Customer(String name) {
        this.name = name;
        this.memberType = MemberType.None;
    }

    Customer(String name, MemberType memberType) {
        this.name = name;
        this.memberType = memberType;
    }

    public void spend(int direction) {
        if (direction < 0) {
            demoteMemberType();
        } else if (direction > 0) {
            promoteMemberType();
        }
    }

    private void promoteMemberType() {
        switch (memberType) {
            case None:
                memberType = MemberType.SILVER;
                break;
            case SILVER:
                memberType = MemberType.GOLD;
                break;
            case GOLD:
                memberType = MemberType.PREMIUM;
        }
        ;
        showMembershipStatus();
    }

    private void demoteMemberType() {
        switch (memberType) {
            case GOLD:
                memberType = MemberType.SILVER;
                break;
            case PREMIUM:
                memberType = MemberType.GOLD;
        }
        ;
        showMembershipStatus();
    }

    public void showMembershipStatus() {
        System.out.println("You are now " + memberType);
    }
}
