class Badge {
    public String print(Integer id, String name, String department) {

        String badge = "";
        if (department == null) {
            department = "OWNER";
        }
        if (id == null) {
            badge = name + " - " + department.toUpperCase();
        } else {
            badge = "[" + id + "] - " + name + " - " + department.toUpperCase();
        }
        return badge;
    }
}
