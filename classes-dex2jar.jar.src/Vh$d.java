import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;

final class Vh$d
  implements Vh.c<ParcelFileDescriptor>
{
  public void a(MediaMetadataRetriever paramMediaMetadataRetriever, ParcelFileDescriptor paramParcelFileDescriptor)
  {
    paramMediaMetadataRetriever.setDataSource(paramParcelFileDescriptor.getFileDescriptor());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Vh$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */