import java.util.Date;

public final class ifa
{
  private final Date created;
  private final String id;
  private final String image;
  private final int image_height;
  private final int image_width;
  private final rfa my_vote;
  private final boolean jdField_public;
  private final String url;
  private final String user_id;
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof ifa))
      {
        paramObject = (ifa)paramObject;
        if ((oXa.a(this.id, ((ifa)paramObject).id)) && (oXa.a(this.user_id, ((ifa)paramObject).user_id)) && (oXa.a(this.url, ((ifa)paramObject).url)))
        {
          int i;
          if (this.jdField_public == ((ifa)paramObject).jdField_public) {
            i = 1;
          } else {
            i = 0;
          }
          if ((i != 0) && (oXa.a(this.image, ((ifa)paramObject).image)))
          {
            if (this.image_width == ((ifa)paramObject).image_width) {
              i = 1;
            } else {
              i = 0;
            }
            if (i != 0)
            {
              if (this.image_height == ((ifa)paramObject).image_height) {
                i = 1;
              } else {
                i = 0;
              }
              if ((i != 0) && (oXa.a(this.created, ((ifa)paramObject).created)) && (oXa.a(this.my_vote, ((ifa)paramObject).my_vote))) {
                break label172;
              }
            }
          }
        }
      }
      return false;
    }
    label172:
    return true;
  }
  
  public final Date getCreated()
  {
    return this.created;
  }
  
  public final String getId()
  {
    return this.id;
  }
  
  public final String getImage()
  {
    return this.image;
  }
  
  public final int getImage_height()
  {
    return this.image_height;
  }
  
  public final int getImage_width()
  {
    return this.image_width;
  }
  
  public final rfa getMy_vote()
  {
    return this.my_vote;
  }
  
  public final boolean getPublic()
  {
    return this.jdField_public;
  }
  
  public final String getUrl()
  {
    return this.url;
  }
  
  public final String getUser_id()
  {
    return this.user_id;
  }
  
  public int hashCode()
  {
    Object localObject = this.id;
    int i = 0;
    int j;
    if (localObject != null) {
      j = ((String)localObject).hashCode();
    } else {
      j = 0;
    }
    localObject = this.user_id;
    int k;
    if (localObject != null) {
      k = ((String)localObject).hashCode();
    } else {
      k = 0;
    }
    localObject = this.url;
    int m;
    if (localObject != null) {
      m = ((String)localObject).hashCode();
    } else {
      m = 0;
    }
    int n = this.jdField_public;
    int i2 = n;
    if (n != 0) {
      i2 = 1;
    }
    localObject = this.image;
    int i1;
    if (localObject != null) {
      i1 = ((String)localObject).hashCode();
    } else {
      i1 = 0;
    }
    int i3 = this.image_width;
    int i4 = this.image_height;
    localObject = this.created;
    int i5;
    if (localObject != null) {
      i5 = ((Date)localObject).hashCode();
    } else {
      i5 = 0;
    }
    localObject = this.my_vote;
    if (localObject != null) {
      i = ((rfa)localObject).hashCode();
    }
    return (((((((j * 31 + k) * 31 + m) * 31 + i2) * 31 + i1) * 31 + i3) * 31 + i4) * 31 + i5) * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("PollLight(id=");
    localStringBuilder.append(this.id);
    localStringBuilder.append(", user_id=");
    localStringBuilder.append(this.user_id);
    localStringBuilder.append(", url=");
    localStringBuilder.append(this.url);
    localStringBuilder.append(", public=");
    localStringBuilder.append(this.jdField_public);
    localStringBuilder.append(", image=");
    localStringBuilder.append(this.image);
    localStringBuilder.append(", image_width=");
    localStringBuilder.append(this.image_width);
    localStringBuilder.append(", image_height=");
    localStringBuilder.append(this.image_height);
    localStringBuilder.append(", created=");
    localStringBuilder.append(this.created);
    localStringBuilder.append(", my_vote=");
    localStringBuilder.append(this.my_vote);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ifa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */