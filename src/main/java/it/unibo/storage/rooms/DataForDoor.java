package it.unibo.storage.rooms;

public class DataForDoor {
    private String id;
    private String dstRoomId;
    private boolean open;

    public DataForDoor() {}

    public DataForDoor(final String id, final String dstRoomId, final boolean open) {
        this.id = id;
        this.dstRoomId = dstRoomId;
        this.open = open;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getDstRoomId() {
        return dstRoomId;
    }

    public void setDstRoomId(final String dstRoomId) {
        this.dstRoomId = dstRoomId;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(final boolean open) {
        this.open = open;
    }
   
}
