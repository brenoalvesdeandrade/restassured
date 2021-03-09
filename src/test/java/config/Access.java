package config;

public enum Access {
    KEY("chave"),TOKEN("Token");

    private String access;

    Access(String access){
        this.access=access;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    @Override
    public String toString() {
        return access;
    }
}
