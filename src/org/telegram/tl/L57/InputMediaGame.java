package org.telegram.tl.L57;

import org.telegram.mtproto.ProtocolBuffer;
import org.telegram.tl.TLObject;
import org.telegram.tl.TLVector;
import org.telegram.tl.APIContext;
import org.telegram.tl.L57.*;

public class InputMediaGame extends org.telegram.tl.TLInputMedia {

    public static final int ID = 0xd33f43f3;

    public org.telegram.tl.TLInputGame id;

    public InputMediaGame() {
    }

    public InputMediaGame(org.telegram.tl.TLInputGame id) {
        this.id = id;
    }

    @Override
    public void deserialize(ProtocolBuffer buffer) {
        id = (org.telegram.tl.TLInputGame) buffer.readTLObject(APIContext.getInstance());
    }

    @Override
    public ProtocolBuffer serialize() {
        ProtocolBuffer buffer = new ProtocolBuffer(12);
        serializeTo(buffer);
        return buffer;
    }


    @Override
    public void serializeTo(ProtocolBuffer buff) {
        buff.writeInt(getConstructor());
        buff.writeTLObject(id);
    }


    public int getConstructor() {
        return ID;
    }
}