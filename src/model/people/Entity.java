package model.people;

import java.util.Objects;

public class Entity implements IOwner{
    private int UNP;
    private String orgName;

    public Entity() {
    }

    public Entity(int UNP, String orgName) {
        this.UNP = UNP;
        this.orgName = orgName;
    }

    public int getUNP() {
        return UNP;
    }

    public void setUNP(int UNP) {
        this.UNP = UNP;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    @Override
    public String getNumber() {
        return String.valueOf(UNP);
    }

    @Override
    public String getName() {
        return orgName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        if(UNP != entity.UNP)return false;
        return orgName != null ? orgName.equals(entity.orgName) : entity.orgName == null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(UNP, orgName);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("model.people.Entity{");
        sb.append("UNP=").append(UNP);
        sb.append(", orgName='").append(orgName).append('\'');
//        sb.append(", number='").append(getNumber()).append('\'');
//        sb.append(", name='").append(getName()).append('\'');
//        sb.append('}');
        return sb.toString();
    }
}
