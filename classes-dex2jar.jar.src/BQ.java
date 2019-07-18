import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.r;

public final class bq
  extends fq
{
  public static final Parcelable.Creator<bq> CREATOR = new cq();
  private final boolean a;
  private final long b;
  private final long c;
  
  public bq(boolean paramBoolean, long paramLong1, long paramLong2)
  {
    this.a = paramBoolean;
    this.b = paramLong1;
    this.c = paramLong2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof bq))
    {
      paramObject = (bq)paramObject;
      if ((this.a == ((bq)paramObject).a) && (this.b == ((bq)paramObject).b) && (this.c == ((bq)paramObject).c)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return r.a(new Object[] { Boolean.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c) });
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
    localStringBuilder.append(this.a);
    localStringBuilder.append(",collectForDebugStartTimeMillis: ");
    localStringBuilder.append(this.b);
    localStringBuilder.append(",collectForDebugExpiryTimeMillis: ");
    localStringBuilder.append(this.c);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = hq.a(paramParcel);
    hq.a(paramParcel, 1, this.a);
    hq.a(paramParcel, 2, this.c);
    hq.a(paramParcel, 3, this.b);
    hq.a(paramParcel, paramInt);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/bq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */