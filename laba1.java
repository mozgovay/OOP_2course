class Plant {
    private int roots;
    private int stem;
    private int leaves;

    public int getRoots() { return roots; }
    public void setRoots(int roots) { this.roots = roots; }
    public int getStem() { return stem; }
    public void setStem(int stem) { this.stem = stem; }
    public int getLeaves() { return leaves; }
    public void setLeaves(int leaves) { this.leaves = leaves; }

    void growRoots() { roots++; }
    void growStem() { stem++; }
    void printPlant() { System.out.println("Корни: " + roots + ", стебель: " + stem); }
}

class Tree extends Plant {
    private int trunk;
    private String crown;
    private String bark;

    public int getTrunk() { return trunk; }
    public void setTrunk(int trunk) { this.trunk = trunk; }
    public String getCrown() { return crown; }
    public void setCrown(String crown) { this.crown = crown; }
    public String getBark() { return bark; }
    public void setBark(String bark) { this.bark = bark; }

    void growTrunk() { trunk++; }
    void changeCrown(String c) { crown = c; }
    void printTree() { System.out.println("Ствол: " + trunk + ", крона: " + crown + ", кора: " + bark); }
}

class ConiferousTree extends Tree {
    private String needles;
    private int cones;
    private boolean resin;

    public String getNeedles() { return needles; }
    public void setNeedles(String needles) { this.needles = needles; }
    public int getCones() { return cones; }
    public void setCones(int cones) { this.cones = cones; }
    public boolean isResin() { return resin; }
    public void setResin(boolean resin) { this.resin = resin; }

    void addCone() { cones++; }
    void dropNeedles() { System.out.println("Хвоя опала"); }
    void printConiferous() { System.out.println("Хвоя: " + needles + ", шишек: " + cones); }
}

public class laba1 {
    public static void main(String[] args) {
        ConiferousTree tree = new ConiferousTree();

        tree.setRoots(50);
        tree.setStem(100);
        tree.setLeaves(0);

        tree.setTrunk(30);
        tree.setCrown("конусовидная");
        tree.setBark("коричневая");

        tree.setNeedles("длинная");
        tree.setCones(10);
        tree.setResin(true);

        tree.growRoots();
        tree.growTrunk();
        tree.addCone();

        tree.printPlant();
        tree.printTree();
        tree.printConiferous();
    }
}
