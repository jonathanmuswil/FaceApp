package com.bumptech.glide.load;

import Oh;
import bg;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class f
{
  public static int a(List<ImageHeaderParser> paramList, InputStream paramInputStream, bg parambg)
    throws IOException
  {
    if (paramInputStream == null) {
      return -1;
    }
    Object localObject = paramInputStream;
    if (!paramInputStream.markSupported()) {
      localObject = new Oh(paramInputStream, parambg);
    }
    ((InputStream)localObject).mark(5242880);
    int i = 0;
    int j = paramList.size();
    while (i < j)
    {
      paramInputStream = (ImageHeaderParser)paramList.get(i);
      try
      {
        int k = paramInputStream.a((InputStream)localObject, parambg);
        if (k != -1) {
          return k;
        }
        ((InputStream)localObject).reset();
        i++;
      }
      finally
      {
        ((InputStream)localObject).reset();
      }
    }
    return -1;
  }
  
  public static ImageHeaderParser.ImageType a(List<ImageHeaderParser> paramList, ByteBuffer paramByteBuffer)
    throws IOException
  {
    if (paramByteBuffer == null) {
      return ImageHeaderParser.ImageType.UNKNOWN;
    }
    int i = 0;
    int j = paramList.size();
    while (i < j)
    {
      ImageHeaderParser.ImageType localImageType = ((ImageHeaderParser)paramList.get(i)).a(paramByteBuffer);
      if (localImageType != ImageHeaderParser.ImageType.UNKNOWN) {
        return localImageType;
      }
      i++;
    }
    return ImageHeaderParser.ImageType.UNKNOWN;
  }
  
  public static ImageHeaderParser.ImageType b(List<ImageHeaderParser> paramList, InputStream paramInputStream, bg parambg)
    throws IOException
  {
    if (paramInputStream == null) {
      return ImageHeaderParser.ImageType.UNKNOWN;
    }
    Object localObject = paramInputStream;
    if (!paramInputStream.markSupported()) {
      localObject = new Oh(paramInputStream, parambg);
    }
    ((InputStream)localObject).mark(5242880);
    int i = 0;
    int j = paramList.size();
    while (i < j)
    {
      paramInputStream = (ImageHeaderParser)paramList.get(i);
      try
      {
        paramInputStream = paramInputStream.a((InputStream)localObject);
        parambg = ImageHeaderParser.ImageType.UNKNOWN;
        if (paramInputStream != parambg) {
          return paramInputStream;
        }
        ((InputStream)localObject).reset();
        i++;
      }
      finally
      {
        ((InputStream)localObject).reset();
      }
    }
    return ImageHeaderParser.ImageType.UNKNOWN;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/bumptech/glide/load/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */