package vendor.qti.hardware.radio.qtiradio.V1_0;

import android.os.HidlSupport;
import android.os.HwBlob;
import android.os.HwParcel;
import java.util.ArrayList;
import java.util.Objects;

public final class OPPO_RIL_Ncell_Info {
    public int arfcn;
    public int rat;
    public int rssi;

    public final boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null || otherObject.getClass() != OPPO_RIL_Ncell_Info.class) {
            return false;
        }
        OPPO_RIL_Ncell_Info other = (OPPO_RIL_Ncell_Info) otherObject;
        return this.rat == other.rat && this.arfcn == other.arfcn && this.rssi == other.rssi;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.rat))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.arfcn))), Integer.valueOf(HidlSupport.deepHashCode(Integer.valueOf(this.rssi)))});
    }

    public final String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        builder.append(".rat = ");
        builder.append(this.rat);
        builder.append(", .arfcn = ");
        builder.append(this.arfcn);
        builder.append(", .rssi = ");
        builder.append(this.rssi);
        builder.append("}");
        return builder.toString();
    }

    public final void readFromParcel(HwParcel parcel) {
        readEmbeddedFromParcel(parcel, parcel.readBuffer(12), 0);
    }

    public static final ArrayList<OPPO_RIL_Ncell_Info> readVectorFromParcel(HwParcel parcel) {
        ArrayList<OPPO_RIL_Ncell_Info> _hidl_vec = new ArrayList();
        HwBlob _hidl_blob = parcel.readBuffer(16);
        int _hidl_vec_size = _hidl_blob.getInt32(8);
        HwBlob childBlob = parcel.readEmbeddedBuffer((long) (_hidl_vec_size * 12), _hidl_blob.handle(), 0, true);
        _hidl_vec.clear();
        for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; _hidl_index_0++) {
            OPPO_RIL_Ncell_Info _hidl_vec_element = new OPPO_RIL_Ncell_Info();
            _hidl_vec_element.readEmbeddedFromParcel(parcel, childBlob, (long) (_hidl_index_0 * 12));
            _hidl_vec.add(_hidl_vec_element);
        }
        return _hidl_vec;
    }

    public final void readEmbeddedFromParcel(HwParcel parcel, HwBlob _hidl_blob, long _hidl_offset) {
        this.rat = _hidl_blob.getInt32(0 + _hidl_offset);
        this.arfcn = _hidl_blob.getInt32(4 + _hidl_offset);
        this.rssi = _hidl_blob.getInt32(8 + _hidl_offset);
    }

    public final void writeToParcel(HwParcel parcel) {
        HwBlob _hidl_blob = new HwBlob(12);
        writeEmbeddedToBlob(_hidl_blob, 0);
        parcel.writeBuffer(_hidl_blob);
    }

    public static final void writeVectorToParcel(HwParcel parcel, ArrayList<OPPO_RIL_Ncell_Info> _hidl_vec) {
        HwBlob _hidl_blob = new HwBlob(16);
        int _hidl_vec_size = _hidl_vec.size();
        _hidl_blob.putInt32(8, _hidl_vec_size);
        _hidl_blob.putBool(12, false);
        HwBlob childBlob = new HwBlob(_hidl_vec_size * 12);
        for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; _hidl_index_0++) {
            ((OPPO_RIL_Ncell_Info) _hidl_vec.get(_hidl_index_0)).writeEmbeddedToBlob(childBlob, (long) (_hidl_index_0 * 12));
        }
        _hidl_blob.putBlob(0, childBlob);
        parcel.writeBuffer(_hidl_blob);
    }

    public final void writeEmbeddedToBlob(HwBlob _hidl_blob, long _hidl_offset) {
        _hidl_blob.putInt32(0 + _hidl_offset, this.rat);
        _hidl_blob.putInt32(4 + _hidl_offset, this.arfcn);
        _hidl_blob.putInt32(8 + _hidl_offset, this.rssi);
    }
}
