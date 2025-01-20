interface itServices{
public void getItServiceDetails();
}

interface hardwareServices{
public void getServiceHardwareDetails();
}
interface  allBranch{
    public void getAllBranch();
}

class CompanyType implements itServices,hardwareServices,allBranch{
public void getItServiceDetails(){
    System.out.println("Get It Services Details");
};

    public void getServiceHardwareDetails(){
        System.out.println("Get hardware  Details");
    };

    public void getAllBranch(){
        System.out.println("Get all Branches");
    }
}


public class MultipleInheritanceExample {
    public static void main(String[] args) {
CompanyType ct1 = new CompanyType();
ct1.getItServiceDetails();
ct1.getServiceHardwareDetails();
ct1.getAllBranch();
    }
}
