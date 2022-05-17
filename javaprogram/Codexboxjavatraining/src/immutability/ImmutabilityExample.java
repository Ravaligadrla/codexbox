package immutability;

public final class ImmutabilityExample {

      private final String name;

       private final int id;

   private  final String mailid;

    private  final long phnumber;


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getMailid() {
        return mailid;
    }

    public Long getPhnumber() {
        return phnumber;
    }

    public ImmutabilityExample(String name, int id, String mailid ,long phnumber) {
        this.name = name;
        this.id = id;
        this.mailid = mailid;
        this.phnumber= phnumber;
    }
}

