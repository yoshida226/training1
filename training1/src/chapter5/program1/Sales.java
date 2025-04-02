package chapter5.program1;

class Sales extends Employee {
    public Sales(String name) {
        super(name, "営業");
    }

    public void replyWeeklyReport() {
        System.out.println("週報の返信をした。");
    }

    public void scheduleMeeting(Engineer engineer) {
        System.out.println(engineer.getName() + " の面談を組んだ。");
    }

    public void holdMeeting() {
        System.out.println("新規の打ち合わせをした。");
    }
    
    public void displayInfo() {
    	System.out.println(name + "：" + department);
    }
}
