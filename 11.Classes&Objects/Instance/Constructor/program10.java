package Instance.Constructor;

class project{
    String projectName = "Online Education System";
    int noOfEmployee = 20;

    void clientInfo(){
        String clientName = "Core2Web";
        System.out.println(clientName);
        System.out.println(projectName);
    }

}

class cw{
    public static void main(String[] args) {
        project obj = new project();
        obj.clientInfo();
    }
}