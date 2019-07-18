import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

@SuppressLint({"ParcelCreator"})
public final class dfa
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new dfa.b();
  public static final dfa.a Companion = new dfa.a(null);
  public static final int SOURCE_CELEBS = 3;
  public static final int SOURCE_FACEAPP_CAMERA = 1;
  public static final int SOURCE_FACEAPP_GALLERY = 2;
  public static final int SOURCE_GALLERY = 4;
  public static final int SOURCE_SOCIAL = 5;
  private final int dataSource;
  private final String deviceBrand;
  private final String deviceModel;
  private final String exposureTime;
  private final Float fNumber;
  private final Integer flash;
  private final Float focalLength;
  private final Float iso;
  
  public dfa(int paramInt)
  {
    this(null, null, null, null, null, null, null, paramInt);
  }
  
  public dfa(String paramString1, String paramString2, Float paramFloat1, Float paramFloat2, String paramString3, Integer paramInteger, Float paramFloat3, int paramInt)
  {
    this.deviceBrand = paramString1;
    this.deviceModel = paramString2;
    this.focalLength = paramFloat1;
    this.fNumber = paramFloat2;
    this.exposureTime = paramString3;
    this.flash = paramInteger;
    this.iso = paramFloat3;
    this.dataSource = paramInt;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof dfa))
      {
        paramObject = (dfa)paramObject;
        if ((oXa.a(this.deviceBrand, ((dfa)paramObject).deviceBrand)) && (oXa.a(this.deviceModel, ((dfa)paramObject).deviceModel)) && (oXa.a(this.focalLength, ((dfa)paramObject).focalLength)) && (oXa.a(this.fNumber, ((dfa)paramObject).fNumber)) && (oXa.a(this.exposureTime, ((dfa)paramObject).exposureTime)) && (oXa.a(this.flash, ((dfa)paramObject).flash)) && (oXa.a(this.iso, ((dfa)paramObject).iso)))
        {
          int i;
          if (this.dataSource == ((dfa)paramObject).dataSource) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0) {
            break label142;
          }
        }
      }
      return false;
    }
    label142:
    return true;
  }
  
  public final String getDeviceBrand()
  {
    return this.deviceBrand;
  }
  
  public final String getDeviceModel()
  {
    return this.deviceModel;
  }
  
  public int hashCode()
  {
    Object localObject = this.deviceBrand;
    int i = 0;
    int j;
    if (localObject != null) {
      j = ((String)localObject).hashCode();
    } else {
      j = 0;
    }
    localObject = this.deviceModel;
    int k;
    if (localObject != null) {
      k = ((String)localObject).hashCode();
    } else {
      k = 0;
    }
    localObject = this.focalLength;
    int m;
    if (localObject != null) {
      m = ((Float)localObject).hashCode();
    } else {
      m = 0;
    }
    localObject = this.fNumber;
    int n;
    if (localObject != null) {
      n = ((Float)localObject).hashCode();
    } else {
      n = 0;
    }
    localObject = this.exposureTime;
    int i1;
    if (localObject != null) {
      i1 = ((String)localObject).hashCode();
    } else {
      i1 = 0;
    }
    localObject = this.flash;
    int i2;
    if (localObject != null) {
      i2 = ((Integer)localObject).hashCode();
    } else {
      i2 = 0;
    }
    localObject = this.iso;
    if (localObject != null) {
      i = ((Float)localObject).hashCode();
    }
    return ((((((j * 31 + k) * 31 + m) * 31 + n) * 31 + i1) * 31 + i2) * 31 + i) * 31 + this.dataSource;
  }
  
  public final vaa.b toProtoPhotoInfo(APa paramAPa)
  {
    oXa.b(paramAPa, "imageSize");
    vaa.b.a locala = vaa.b.o();
    if ((this.deviceBrand != null) && (this.deviceModel != null))
    {
      oXa.a(locala, "builder");
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(this.deviceBrand);
      ((StringBuilder)localObject).append(' ');
      ((StringBuilder)localObject).append(this.deviceModel);
      locala.a(((StringBuilder)localObject).toString());
    }
    Object localObject = this.focalLength;
    if (localObject != null) {
      locala.b(((Float)localObject).floatValue());
    }
    localObject = this.fNumber;
    if (localObject != null) {
      locala.a(((Float)localObject).floatValue());
    }
    localObject = this.exposureTime;
    if (localObject != null)
    {
      oXa.a(locala, "builder");
      locala.b((String)localObject);
    }
    localObject = this.flash;
    if (localObject != null)
    {
      int i = ((Integer)localObject).intValue();
      boolean bool = true;
      if (i != 1) {
        bool = false;
      }
      locala.a(bool);
    }
    localObject = this.iso;
    if (localObject != null) {
      locala.c(((Float)localObject).floatValue());
    }
    oXa.a(locala, "builder");
    locala.a(vaa.b.b.a(this.dataSource));
    localObject = YZ.n();
    ((YZ.a)localObject).b(paramAPa.c());
    ((YZ.a)localObject).a(paramAPa.b());
    locala.a((YZ)((PT.a)localObject).build());
    paramAPa = locala.build();
    oXa.a(paramAPa, "builder.build()");
    return (vaa.b)paramAPa;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("PhotoInfo(deviceBrand=");
    localStringBuilder.append(this.deviceBrand);
    localStringBuilder.append(", deviceModel=");
    localStringBuilder.append(this.deviceModel);
    localStringBuilder.append(", focalLength=");
    localStringBuilder.append(this.focalLength);
    localStringBuilder.append(", fNumber=");
    localStringBuilder.append(this.fNumber);
    localStringBuilder.append(", exposureTime=");
    localStringBuilder.append(this.exposureTime);
    localStringBuilder.append(", flash=");
    localStringBuilder.append(this.flash);
    localStringBuilder.append(", iso=");
    localStringBuilder.append(this.iso);
    localStringBuilder.append(", dataSource=");
    localStringBuilder.append(this.dataSource);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    oXa.b(paramParcel, "parcel");
    paramParcel.writeString(this.deviceBrand);
    paramParcel.writeString(this.deviceModel);
    Object localObject = this.focalLength;
    if (localObject != null)
    {
      paramParcel.writeInt(1);
      paramParcel.writeFloat(((Float)localObject).floatValue());
    }
    else
    {
      paramParcel.writeInt(0);
    }
    localObject = this.fNumber;
    if (localObject != null)
    {
      paramParcel.writeInt(1);
      paramParcel.writeFloat(((Float)localObject).floatValue());
    }
    else
    {
      paramParcel.writeInt(0);
    }
    paramParcel.writeString(this.exposureTime);
    localObject = this.flash;
    if (localObject != null)
    {
      paramParcel.writeInt(1);
      paramParcel.writeInt(((Integer)localObject).intValue());
    }
    else
    {
      paramParcel.writeInt(0);
    }
    localObject = this.iso;
    if (localObject != null)
    {
      paramParcel.writeInt(1);
      paramParcel.writeFloat(((Float)localObject).floatValue());
    }
    else
    {
      paramParcel.writeInt(0);
    }
    paramParcel.writeInt(this.dataSource);
  }
  
  public static final class a {}
  
  public static final class b
    implements Parcelable.Creator
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      oXa.b(paramParcel, "in");
      String str1 = paramParcel.readString();
      String str2 = paramParcel.readString();
      Float localFloat1;
      if (paramParcel.readInt() != 0) {
        localFloat1 = Float.valueOf(paramParcel.readFloat());
      } else {
        localFloat1 = null;
      }
      Float localFloat2;
      if (paramParcel.readInt() != 0) {
        localFloat2 = Float.valueOf(paramParcel.readFloat());
      } else {
        localFloat2 = null;
      }
      String str3 = paramParcel.readString();
      Integer localInteger;
      if (paramParcel.readInt() != 0) {
        localInteger = Integer.valueOf(paramParcel.readInt());
      } else {
        localInteger = null;
      }
      Float localFloat3;
      if (paramParcel.readInt() != 0) {
        localFloat3 = Float.valueOf(paramParcel.readFloat());
      } else {
        localFloat3 = null;
      }
      return new dfa(str1, str2, localFloat1, localFloat2, str3, localInteger, localFloat3, paramParcel.readInt());
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new dfa[paramInt];
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/dfa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */