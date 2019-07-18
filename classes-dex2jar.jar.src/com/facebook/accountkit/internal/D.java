package com.facebook.accountkit.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class d
  implements CookieStore
{
  private static final List<String> a = new ArrayList();
  private static final List<String> b = new ArrayList();
  private final Map<URI, List<HttpCookie>> c = new HashMap();
  private final SharedPreferences d;
  
  static
  {
    a.add(".accountkit.com");
    b.add("aksb");
  }
  
  public d(Context paramContext)
  {
    this.d = paramContext.getSharedPreferences("cookieStore", 0);
    a();
  }
  
  private URI a(URI paramURI)
  {
    if (paramURI == null) {
      return null;
    }
    try
    {
      URI localURI = new URI("http", paramURI.getHost(), null, null);
      return localURI;
    }
    catch (URISyntaxException localURISyntaxException) {}
    return paramURI;
  }
  
  private void a()
  {
    Iterator localIterator = this.d.getAll().entrySet().iterator();
    for (;;)
    {
      Object localObject1;
      Object localObject2;
      if (localIterator.hasNext())
      {
        localObject1 = (Map.Entry)localIterator.next();
        localObject2 = ((String)((Map.Entry)localObject1).getKey()).split("\\|", 2);
      }
      try
      {
        URI localURI = new java/net/URI;
        localURI.<init>(localObject2[0]);
        localObject1 = (String)((Map.Entry)localObject1).getValue();
        localObject2 = new com/facebook/accountkit/internal/qa;
        ((qa)localObject2).<init>();
        HttpCookie localHttpCookie = ((qa)localObject2).a((String)localObject1);
        if (localHttpCookie == null) {
          continue;
        }
        localObject1 = (List)this.c.get(localURI);
        localObject2 = localObject1;
        if (localObject1 == null)
        {
          localObject2 = new java/util/ArrayList;
          ((ArrayList)localObject2).<init>();
          this.c.put(localURI, localObject2);
        }
        ((List)localObject2).add(localHttpCookie);
      }
      catch (URISyntaxException localURISyntaxException) {}
      return;
    }
  }
  
  private void a(URI paramURI, HttpCookie paramHttpCookie)
  {
    if ((a.contains(paramHttpCookie.getDomain())) && (b.contains(paramHttpCookie.getName())))
    {
      SharedPreferences.Editor localEditor = this.d.edit();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramURI.toString());
      localStringBuilder.append("|");
      localStringBuilder.append(paramHttpCookie.getName());
      localEditor.putString(localStringBuilder.toString(), new qa().a(paramHttpCookie));
      localEditor.apply();
    }
  }
  
  public void add(URI paramURI, HttpCookie paramHttpCookie)
  {
    if (paramHttpCookie != null) {
      try
      {
        URI localURI = a(paramURI);
        paramURI = (List)this.c.get(localURI);
        if (paramURI == null)
        {
          paramURI = new java/util/ArrayList;
          paramURI.<init>();
          this.c.put(localURI, paramURI);
        }
        else
        {
          paramURI.remove(paramHttpCookie);
        }
        paramURI.add(paramHttpCookie);
        a(localURI, paramHttpCookie);
        return;
      }
      finally
      {
        break label94;
      }
    }
    paramURI = new java/lang/NullPointerException;
    paramURI.<init>("cookie == null");
    throw paramURI;
    label94:
    throw paramURI;
  }
  
  public List<HttpCookie> get(URI paramURI)
  {
    if (paramURI != null) {
      try
      {
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        Object localObject1 = (List)this.c.get(paramURI);
        Object localObject2;
        if (localObject1 != null)
        {
          localObject2 = ((List)localObject1).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            localObject1 = (HttpCookie)((Iterator)localObject2).next();
            if (((HttpCookie)localObject1).hasExpired()) {
              ((Iterator)localObject2).remove();
            } else {
              localArrayList.add(localObject1);
            }
          }
        }
        localObject1 = this.c.entrySet().iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (Map.Entry)((Iterator)localObject1).next();
          if (!paramURI.equals(((Map.Entry)localObject2).getKey()))
          {
            localObject2 = ((List)((Map.Entry)localObject2).getValue()).iterator();
            while (((Iterator)localObject2).hasNext())
            {
              HttpCookie localHttpCookie = (HttpCookie)((Iterator)localObject2).next();
              if (HttpCookie.domainMatches(localHttpCookie.getDomain(), paramURI.getHost())) {
                if (localHttpCookie.hasExpired()) {
                  ((Iterator)localObject2).remove();
                } else if (!localArrayList.contains(localHttpCookie)) {
                  localArrayList.add(localHttpCookie);
                }
              }
            }
          }
        }
        paramURI = Collections.unmodifiableList(localArrayList);
        return paramURI;
      }
      finally
      {
        break label264;
      }
    }
    paramURI = new java/lang/NullPointerException;
    paramURI.<init>("uri == null");
    throw paramURI;
    label264:
    throw paramURI;
  }
  
  public List<HttpCookie> getCookies()
  {
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Object localObject1 = this.c.values().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Iterator localIterator = ((List)((Iterator)localObject1).next()).iterator();
        while (localIterator.hasNext())
        {
          HttpCookie localHttpCookie = (HttpCookie)localIterator.next();
          if (localHttpCookie.hasExpired()) {
            localIterator.remove();
          } else if (!localArrayList.contains(localHttpCookie)) {
            localArrayList.add(localHttpCookie);
          }
        }
      }
      localObject1 = Collections.unmodifiableList(localArrayList);
      return (List<HttpCookie>)localObject1;
    }
    finally {}
  }
  
  public List<URI> getURIs()
  {
    try
    {
      Object localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>(this.c.keySet());
      ((List)localObject1).remove(null);
      localObject1 = Collections.unmodifiableList((List)localObject1);
      return (List<URI>)localObject1;
    }
    finally
    {
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
  }
  
  public boolean remove(URI paramURI, HttpCookie paramHttpCookie)
  {
    if (paramHttpCookie != null) {
      try
      {
        paramURI = (List)this.c.get(a(paramURI));
        if (paramURI != null)
        {
          boolean bool = paramURI.remove(paramHttpCookie);
          return bool;
        }
        return false;
      }
      finally
      {
        break label60;
      }
    }
    paramURI = new java/lang/NullPointerException;
    paramURI.<init>("cookie == null");
    throw paramURI;
    label60:
    throw paramURI;
  }
  
  public boolean removeAll()
  {
    try
    {
      boolean bool;
      if (!this.c.isEmpty()) {
        bool = true;
      } else {
        bool = false;
      }
      this.c.clear();
      return bool;
    }
    finally {}
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/internal/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */