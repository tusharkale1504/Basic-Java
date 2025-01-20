interface itService{
public void getItServicesDetails();
}

interface hardwareService{
    public void getHardwareDetails();
}


class BaseCompany implements itService,hardwareService{
void getBaseCompanyDetails(){
    System.out.println("Base company details printed");
}

public void getItServicesDetails(){
    System.out.println("get It Service Details");
}

    public void getHardwareDetails(){
        System.out.println("get Hardware Details");
    }

}

class ChildCompany extends BaseCompany{

}

class LocalCompany extends ChildCompany{

}

class SharedCompany extends  BaseCompany{

}


public class HybridInheritanceExample {
    public static void main(String[] args) {
LocalCompany lc = new LocalCompany();
SharedCompany sc = new SharedCompany();


lc.getBaseCompanyDetails();
sc.getBaseCompanyDetails();
sc.getItServicesDetails();
sc.getHardwareDetails();
    }
}
