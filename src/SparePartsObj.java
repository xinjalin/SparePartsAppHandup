public record SparePartsObj(String name, Boolean genuine) {

    public String toString() {
        return name + genuine;
    }

}