import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.r;
import java.util.Arrays;

public final class dq
  extends fq
{
  public static final Parcelable.Creator<dq> CREATOR = new eq();
  public Uu a;
  public byte[] b;
  private int[] c;
  private String[] d;
  private int[] e;
  private byte[][] f;
  private pO[] g;
  private boolean h;
  public final Ju i;
  public final Zp.c j;
  public final Zp.c k;
  
  public dq(Uu paramUu, Ju paramJu, Zp.c paramc1, Zp.c paramc2, int[] paramArrayOfInt1, String[] paramArrayOfString, int[] paramArrayOfInt2, byte[][] paramArrayOfByte, pO[] paramArrayOfpO, boolean paramBoolean)
  {
    this.a = paramUu;
    this.i = paramJu;
    this.j = paramc1;
    this.k = null;
    this.c = paramArrayOfInt1;
    this.d = null;
    this.e = paramArrayOfInt2;
    this.f = null;
    this.g = null;
    this.h = paramBoolean;
  }
  
  dq(Uu paramUu, byte[] paramArrayOfByte, int[] paramArrayOfInt1, String[] paramArrayOfString, int[] paramArrayOfInt2, byte[][] paramArrayOfByte1, boolean paramBoolean, pO[] paramArrayOfpO)
  {
    this.a = paramUu;
    this.b = paramArrayOfByte;
    this.c = paramArrayOfInt1;
    this.d = paramArrayOfString;
    this.i = null;
    this.j = null;
    this.k = null;
    this.e = paramArrayOfInt2;
    this.f = paramArrayOfByte1;
    this.g = paramArrayOfpO;
    this.h = paramBoolean;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof dq))
    {
      paramObject = (dq)paramObject;
      if ((r.a(this.a, ((dq)paramObject).a)) && (Arrays.equals(this.b, ((dq)paramObject).b)) && (Arrays.equals(this.c, ((dq)paramObject).c)) && (Arrays.equals(this.d, ((dq)paramObject).d)) && (r.a(this.i, ((dq)paramObject).i)) && (r.a(this.j, ((dq)paramObject).j)) && (r.a(this.k, ((dq)paramObject).k)) && (Arrays.equals(this.e, ((dq)paramObject).e)) && (Arrays.deepEquals(this.f, ((dq)paramObject).f)) && (Arrays.equals(this.g, ((dq)paramObject).g)) && (this.h == ((dq)paramObject).h)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return r.a(new Object[] { this.a, this.b, this.c, this.d, this.i, this.j, this.k, this.e, this.f, this.g, Boolean.valueOf(this.h) });
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("LogEventParcelable[");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", LogEventBytes: ");
    Object localObject = this.b;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = new String((byte[])localObject);
    }
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(", TestCodes: ");
    localStringBuilder.append(Arrays.toString(this.c));
    localStringBuilder.append(", MendelPackages: ");
    localStringBuilder.append(Arrays.toString(this.d));
    localStringBuilder.append(", LogEvent: ");
    localStringBuilder.append(this.i);
    localStringBuilder.append(", ExtensionProducer: ");
    localStringBuilder.append(this.j);
    localStringBuilder.append(", VeProducer: ");
    localStringBuilder.append(this.k);
    localStringBuilder.append(", ExperimentIDs: ");
    localStringBuilder.append(Arrays.toString(this.e));
    localStringBuilder.append(", ExperimentTokens: ");
    localStringBuilder.append(Arrays.toString(this.f));
    localStringBuilder.append(", ExperimentTokensParcelables: ");
    localStringBuilder.append(Arrays.toString(this.g));
    localStringBuilder.append(", AddPhenotypeExperimentTokens: ");
    localStringBuilder.append(this.h);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int m = hq.a(paramParcel);
    hq.a(paramParcel, 2, this.a, paramInt, false);
    hq.a(paramParcel, 3, this.b, false);
    hq.a(paramParcel, 4, this.c, false);
    hq.a(paramParcel, 5, this.d, false);
    hq.a(paramParcel, 6, this.e, false);
    hq.a(paramParcel, 7, this.f, false);
    hq.a(paramParcel, 8, this.h);
    hq.a(paramParcel, 9, this.g, paramInt, false);
    hq.a(paramParcel, m);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/dq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */