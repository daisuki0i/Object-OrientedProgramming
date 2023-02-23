package Lab6;

public class Client implements CanPay {
    private String name;
    private MemberTypeWithDiscount memberType;

    Client(String name) {
        this.name = name;
        memberType = MemberTypeWithDiscount.None;
    }

    public void spend(int direction) {
        if (direction < 0) {
            demoteMemberType();

        }
        if (direction > 0) {
            promoteMemberType();
        }
    }

    private void promoteMemberType() {
        switch (memberType) {
            case None:
                memberType = MemberTypeWithDiscount.SILVER;
                break;
            case SILVER:
                memberType = MemberTypeWithDiscount.GOLD;
                break;
            case GOLD:
                memberType = MemberTypeWithDiscount.PREMIUM;
        }
        ;
        showMembershipStatus();
    }

    private void demoteMemberType() {
        switch (memberType) {
            case GOLD:
                memberType = MemberTypeWithDiscount.SILVER;
                break;
            case PREMIUM:
                memberType = MemberTypeWithDiscount.GOLD;
        }
        ;
        showMembershipStatus();
    }

    public void showMembershipStatus() {
        System.out.println("You are now " + memberType + " " + ((int) (memberType.getProductDiscount() * 10)
                + "%discount on Product" + (int) (memberType.getServiceDiscount() * 10) + "% on service"));
    }

}
