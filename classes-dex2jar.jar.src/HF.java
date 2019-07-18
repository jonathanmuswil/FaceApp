import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.a;
import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class hf<T>
  implements Ze<T>
{
  private final Uri a;
  private final ContentResolver b;
  private T c;
  
  public hf(ContentResolver paramContentResolver, Uri paramUri)
  {
    this.b = paramContentResolver;
    this.a = paramUri;
  }
  
  protected abstract T a(Uri paramUri, ContentResolver paramContentResolver)
    throws FileNotFoundException;
  
  public final void a(Fe paramFe, Ze.a<? super T> parama)
  {
    try
    {
      this.c = a(this.a, this.b);
      parama.a(this.c);
      return;
    }
    catch (FileNotFoundException paramFe)
    {
      if (Log.isLoggable("LocalUriFetcher", 3)) {
        Log.d("LocalUriFetcher", "Failed to open Uri", paramFe);
      }
      parama.a(paramFe);
    }
  }
  
  protected abstract void a(T paramT)
    throws IOException;
  
  public void b()
  {
    Object localObject = this.c;
    if (localObject != null) {}
    try
    {
      a(localObject);
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  public a c()
  {
    return a.a;
  }
  
  public void cancel() {}
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/hf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */