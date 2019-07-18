import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class hq
{
  public static int a(Parcel paramParcel)
  {
    return b(paramParcel, 20293);
  }
  
  public static void a(Parcel paramParcel, int paramInt)
  {
    c(paramParcel, paramInt);
  }
  
  public static void a(Parcel paramParcel, int paramInt, float paramFloat)
  {
    b(paramParcel, paramInt, 4);
    paramParcel.writeFloat(paramFloat);
  }
  
  public static void a(Parcel paramParcel, int paramInt1, int paramInt2)
  {
    b(paramParcel, paramInt1, 4);
    paramParcel.writeInt(paramInt2);
  }
  
  public static void a(Parcel paramParcel, int paramInt, long paramLong)
  {
    b(paramParcel, paramInt, 8);
    paramParcel.writeLong(paramLong);
  }
  
  public static void a(Parcel paramParcel, int paramInt, Bundle paramBundle, boolean paramBoolean)
  {
    if (paramBundle == null)
    {
      if (paramBoolean) {
        b(paramParcel, paramInt, 0);
      }
      return;
    }
    paramInt = b(paramParcel, paramInt);
    paramParcel.writeBundle(paramBundle);
    c(paramParcel, paramInt);
  }
  
  public static void a(Parcel paramParcel, int paramInt, IBinder paramIBinder, boolean paramBoolean)
  {
    if (paramIBinder == null)
    {
      if (paramBoolean) {
        b(paramParcel, paramInt, 0);
      }
      return;
    }
    paramInt = b(paramParcel, paramInt);
    paramParcel.writeStrongBinder(paramIBinder);
    c(paramParcel, paramInt);
  }
  
  public static void a(Parcel paramParcel, int paramInt1, Parcelable paramParcelable, int paramInt2, boolean paramBoolean)
  {
    if (paramParcelable == null)
    {
      if (paramBoolean) {
        b(paramParcel, paramInt1, 0);
      }
      return;
    }
    paramInt1 = b(paramParcel, paramInt1);
    paramParcelable.writeToParcel(paramParcel, paramInt2);
    c(paramParcel, paramInt1);
  }
  
  public static void a(Parcel paramParcel, int paramInt, Boolean paramBoolean, boolean paramBoolean1)
  {
    if (paramBoolean == null)
    {
      if (paramBoolean1) {
        b(paramParcel, paramInt, 0);
      }
      return;
    }
    b(paramParcel, paramInt, 4);
    paramParcel.writeInt(paramBoolean.booleanValue());
  }
  
  public static void a(Parcel paramParcel, int paramInt, Double paramDouble, boolean paramBoolean)
  {
    if (paramDouble == null)
    {
      if (paramBoolean) {
        b(paramParcel, paramInt, 0);
      }
      return;
    }
    b(paramParcel, paramInt, 8);
    paramParcel.writeDouble(paramDouble.doubleValue());
  }
  
  public static void a(Parcel paramParcel, int paramInt, Float paramFloat, boolean paramBoolean)
  {
    if (paramFloat == null)
    {
      if (paramBoolean) {
        b(paramParcel, paramInt, 0);
      }
      return;
    }
    b(paramParcel, paramInt, 4);
    paramParcel.writeFloat(paramFloat.floatValue());
  }
  
  public static void a(Parcel paramParcel, int paramInt, Long paramLong, boolean paramBoolean)
  {
    if (paramLong == null)
    {
      if (paramBoolean) {
        b(paramParcel, paramInt, 0);
      }
      return;
    }
    b(paramParcel, paramInt, 8);
    paramParcel.writeLong(paramLong.longValue());
  }
  
  public static void a(Parcel paramParcel, int paramInt, String paramString, boolean paramBoolean)
  {
    if (paramString == null)
    {
      if (paramBoolean) {
        b(paramParcel, paramInt, 0);
      }
      return;
    }
    paramInt = b(paramParcel, paramInt);
    paramParcel.writeString(paramString);
    c(paramParcel, paramInt);
  }
  
  public static void a(Parcel paramParcel, int paramInt, List<Integer> paramList, boolean paramBoolean)
  {
    int i = 0;
    if (paramList == null)
    {
      if (paramBoolean) {
        b(paramParcel, paramInt, 0);
      }
      return;
    }
    int j = b(paramParcel, paramInt);
    int k = paramList.size();
    paramParcel.writeInt(k);
    for (paramInt = i; paramInt < k; paramInt++) {
      paramParcel.writeInt(((Integer)paramList.get(paramInt)).intValue());
    }
    c(paramParcel, j);
  }
  
  public static void a(Parcel paramParcel, int paramInt, boolean paramBoolean)
  {
    b(paramParcel, paramInt, 4);
    paramParcel.writeInt(paramBoolean);
  }
  
  public static void a(Parcel paramParcel, int paramInt, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    if (paramArrayOfByte == null)
    {
      if (paramBoolean) {
        b(paramParcel, paramInt, 0);
      }
      return;
    }
    paramInt = b(paramParcel, paramInt);
    paramParcel.writeByteArray(paramArrayOfByte);
    c(paramParcel, paramInt);
  }
  
  public static void a(Parcel paramParcel, int paramInt, int[] paramArrayOfInt, boolean paramBoolean)
  {
    if (paramArrayOfInt == null)
    {
      if (paramBoolean) {
        b(paramParcel, paramInt, 0);
      }
      return;
    }
    paramInt = b(paramParcel, paramInt);
    paramParcel.writeIntArray(paramArrayOfInt);
    c(paramParcel, paramInt);
  }
  
  public static <T extends Parcelable> void a(Parcel paramParcel, int paramInt1, T[] paramArrayOfT, int paramInt2, boolean paramBoolean)
  {
    if (paramArrayOfT == null)
    {
      if (paramBoolean) {
        b(paramParcel, paramInt1, 0);
      }
      return;
    }
    int i = b(paramParcel, paramInt1);
    int j = paramArrayOfT.length;
    paramParcel.writeInt(j);
    for (paramInt1 = 0; paramInt1 < j; paramInt1++)
    {
      T ? = paramArrayOfT[paramInt1];
      if (? == null) {
        paramParcel.writeInt(0);
      } else {
        a(paramParcel, ?, paramInt2);
      }
    }
    c(paramParcel, i);
  }
  
  public static void a(Parcel paramParcel, int paramInt, String[] paramArrayOfString, boolean paramBoolean)
  {
    if (paramArrayOfString == null)
    {
      if (paramBoolean) {
        b(paramParcel, paramInt, 0);
      }
      return;
    }
    paramInt = b(paramParcel, paramInt);
    paramParcel.writeStringArray(paramArrayOfString);
    c(paramParcel, paramInt);
  }
  
  public static void a(Parcel paramParcel, int paramInt, byte[][] paramArrayOfByte, boolean paramBoolean)
  {
    int i = 0;
    if (paramArrayOfByte == null)
    {
      if (paramBoolean) {
        b(paramParcel, paramInt, 0);
      }
      return;
    }
    int j = b(paramParcel, paramInt);
    int k = paramArrayOfByte.length;
    paramParcel.writeInt(k);
    for (paramInt = i; paramInt < k; paramInt++) {
      paramParcel.writeByteArray(paramArrayOfByte[paramInt]);
    }
    c(paramParcel, j);
  }
  
  private static <T extends Parcelable> void a(Parcel paramParcel, T paramT, int paramInt)
  {
    int i = paramParcel.dataPosition();
    paramParcel.writeInt(1);
    int j = paramParcel.dataPosition();
    paramT.writeToParcel(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    paramParcel.setDataPosition(i);
    paramParcel.writeInt(paramInt - j);
    paramParcel.setDataPosition(paramInt);
  }
  
  private static int b(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(paramInt | 0xFFFF0000);
    paramParcel.writeInt(0);
    return paramParcel.dataPosition();
  }
  
  private static void b(Parcel paramParcel, int paramInt1, int paramInt2)
  {
    if (paramInt2 >= 65535)
    {
      paramParcel.writeInt(paramInt1 | 0xFFFF0000);
      paramParcel.writeInt(paramInt2);
      return;
    }
    paramParcel.writeInt(paramInt1 | paramInt2 << 16);
  }
  
  public static void b(Parcel paramParcel, int paramInt, List<String> paramList, boolean paramBoolean)
  {
    if (paramList == null)
    {
      if (paramBoolean) {
        b(paramParcel, paramInt, 0);
      }
      return;
    }
    paramInt = b(paramParcel, paramInt);
    paramParcel.writeStringList(paramList);
    c(paramParcel, paramInt);
  }
  
  private static void c(Parcel paramParcel, int paramInt)
  {
    int i = paramParcel.dataPosition();
    paramParcel.setDataPosition(paramInt - 4);
    paramParcel.writeInt(i - paramInt);
    paramParcel.setDataPosition(i);
  }
  
  public static <T extends Parcelable> void c(Parcel paramParcel, int paramInt, List<T> paramList, boolean paramBoolean)
  {
    if (paramList == null)
    {
      if (paramBoolean) {
        b(paramParcel, paramInt, 0);
      }
      return;
    }
    int i = b(paramParcel, paramInt);
    int j = paramList.size();
    paramParcel.writeInt(j);
    for (paramInt = 0; paramInt < j; paramInt++)
    {
      Parcelable localParcelable = (Parcelable)paramList.get(paramInt);
      if (localParcelable == null) {
        paramParcel.writeInt(0);
      } else {
        a(paramParcel, localParcelable, 0);
      }
    }
    c(paramParcel, i);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/hq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */