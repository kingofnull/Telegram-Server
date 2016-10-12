package org.telegram.tl.messages;

import org.telegram.mtproto.ProtocolBuffer;
import org.telegram.tl.*;

public class GetAttachedStickers extends TLObject {

    public static final int ID = 0xcc5b67cc;

    public TLInputStickeredMedia media;

    public GetAttachedStickers() {
    }

    public GetAttachedStickers(TLInputStickeredMedia media) {
        this.media = media;
    }

    @Override
    public void deserialize(ProtocolBuffer buffer) {
        media = (TLInputStickeredMedia) buffer.readTLObject(APIContext.getInstance());
    }

    @Override
    public ProtocolBuffer serialize() {
        ProtocolBuffer buffer = new ProtocolBuffer(32);
        serializeTo(buffer);
        return buffer;
    }


    @Override
    public void serializeTo(ProtocolBuffer buff) {
        buff.writeInt(getConstructor());
        buff.writeTLObject(media);
    }


    public int getConstructor() {
        return ID;
    }
}