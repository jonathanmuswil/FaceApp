import java.util.Date;
import java.util.List;
import java.util.Map;

public final class hfa
{
  private final Date created;
  private final String id;
  private final String image;
  private final int image_height;
  private final int image_width;
  private final boolean is_bookmarked;
  private final rfa my_vote;
  private final boolean jdField_public;
  private final List<String> suggested_comments;
  private final String url;
  private final String user_id;
  private final List<rfa> votes;
  private final Map<String, Integer> votes_counts;
  private final int votes_total;
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      if ((paramObject instanceof hfa))
      {
        paramObject = (hfa)paramObject;
        if ((oXa.a(this.id, ((hfa)paramObject).id)) && (oXa.a(this.user_id, ((hfa)paramObject).user_id)) && (oXa.a(this.url, ((hfa)paramObject).url)))
        {
          int i;
          if (this.jdField_public == ((hfa)paramObject).jdField_public) {
            i = 1;
          } else {
            i = 0;
          }
          if ((i != 0) && (oXa.a(this.image, ((hfa)paramObject).image)))
          {
            if (this.image_width == ((hfa)paramObject).image_width) {
              i = 1;
            } else {
              i = 0;
            }
            if (i != 0)
            {
              if (this.image_height == ((hfa)paramObject).image_height) {
                i = 1;
              } else {
                i = 0;
              }
              if ((i != 0) && (oXa.a(this.created, ((hfa)paramObject).created)) && (oXa.a(this.votes, ((hfa)paramObject).votes)))
              {
                if (this.votes_total == ((hfa)paramObject).votes_total) {
                  i = 1;
                } else {
                  i = 0;
                }
                if ((i != 0) && (oXa.a(this.votes_counts, ((hfa)paramObject).votes_counts)) && (oXa.a(this.my_vote, ((hfa)paramObject).my_vote)))
                {
                  if (this.is_bookmarked == ((hfa)paramObject).is_bookmarked) {
                    i = 1;
                  } else {
                    i = 0;
                  }
                  if ((i != 0) && (oXa.a(this.suggested_comments, ((hfa)paramObject).suggested_comments))) {
                    break label258;
                  }
                }
              }
            }
          }
        }
      }
      return false;
    }
    label258:
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
  
  public final List<String> getSuggested_comments()
  {
    return this.suggested_comments;
  }
  
  public final String getUrl()
  {
    return this.url;
  }
  
  public final String getUser_id()
  {
    return this.user_id;
  }
  
  public final List<rfa> getVotes()
  {
    return this.votes;
  }
  
  public final Map<String, Integer> getVotes_counts()
  {
    return this.votes_counts;
  }
  
  public final int getVotes_total()
  {
    return this.votes_total;
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
    localObject = this.votes;
    int i6;
    if (localObject != null) {
      i6 = localObject.hashCode();
    } else {
      i6 = 0;
    }
    int i7 = this.votes_total;
    localObject = this.votes_counts;
    int i8;
    if (localObject != null) {
      i8 = localObject.hashCode();
    } else {
      i8 = 0;
    }
    localObject = this.my_vote;
    int i9;
    if (localObject != null) {
      i9 = ((rfa)localObject).hashCode();
    } else {
      i9 = 0;
    }
    int i10 = this.is_bookmarked;
    int i11 = i10;
    if (i10 != 0) {
      i11 = 1;
    }
    localObject = this.suggested_comments;
    if (localObject != null) {
      i = localObject.hashCode();
    }
    return ((((((((((((j * 31 + k) * 31 + m) * 31 + i2) * 31 + i1) * 31 + i3) * 31 + i4) * 31 + i5) * 31 + i6) * 31 + i7) * 31 + i8) * 31 + i9) * 31 + i11) * 31 + i;
  }
  
  public final boolean is_bookmarked()
  {
    return this.is_bookmarked;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("PollDetailed(id=");
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
    localStringBuilder.append(", votes=");
    localStringBuilder.append(this.votes);
    localStringBuilder.append(", votes_total=");
    localStringBuilder.append(this.votes_total);
    localStringBuilder.append(", votes_counts=");
    localStringBuilder.append(this.votes_counts);
    localStringBuilder.append(", my_vote=");
    localStringBuilder.append(this.my_vote);
    localStringBuilder.append(", is_bookmarked=");
    localStringBuilder.append(this.is_bookmarked);
    localStringBuilder.append(", suggested_comments=");
    localStringBuilder.append(this.suggested_comments);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/hfa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */