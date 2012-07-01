package fr.mildlyusefulsoftware.killersharks.activity;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.util.Log;
import fr.mildlyusefulsoftware.imageviewer.service.DatabaseHelper;
import fr.mildlyusefulsoftware.imageviewer.service.Picture;

public class ViewPictureActivity extends fr.mildlyusefulsoftware.imageviewer.activity.ViewPictureActivity {

	@Override
	protected String getAdMobId() {
		return "a14ff056438f708";
	}

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	//	putNewPictures();
	}
	
	private void putNewPictures(){
		String[] url =new String[]{
				"http://ffden-2.phys.uaf.edu/104_2012_web_projects/Jenna_Schmidt/Images/hungry_shark-218.jpg",
				"http://coolfacts.in/wp-content/uploads/2011/04/shark-goes-after-seal-photo-credit-national-geographic.jpg",
				"http://carilynjohnson.com/wp-content/uploads/2012/03/shark-214.jpg",
				"http://static.ddmcdn.com/gif/great-white-shark-1.jpg",
				"http://static.guim.co.uk/sys-images/Guardian/Pix/pictures/2009/6/23/1245777821189/Sharks-endangered-Basking-010.jpg",
				"http://resources2.news.com.au/images/2010/10/30/1225945/533422-pn-shark-attack.jpg",
				"http://transfersmart.blogspot.com/2012/02/how-to-scuba-dive-with-sharks.html",
				"http://underwater.com.au/content/7395/great_white_shark_4.jpg",
				"http://www.vilainetortue.fr/wp-content/uploads/2011/11/sharm-shark-white-_1779070c.jpeg",
				"http://www.namibian.org/travel/marine-life/photos/fullsize/great-white-shark_fs.jpg",
				"http://emol.org/tv/programs/sharkweek/Shark_Week_77.jpg",
				"http://www.ripleyaquariums.com/gatlinburg/files/2011/12/great-white-sharks.jpg",
				"http://i.telegraph.co.uk/multimedia/archive/01430/shark_1430236c.jpg",
				"http://www.lifeglobe.com/images/product/Sharks/sharks04_r2_c2.jpg",
				"http://s.ngm.com/2007/03/bahamian-sharks/img/tiger-shark-prowl-615.jpg",
				"http://www.thedorsalfin.com/wp-content/uploads/2010/11/guadalupe-great-white-shark.jpg",
				"http://www.reefnews.com/reefnews/news/v07/v07n06/sharks03.jpg",
				"http://www.thehorrorzine.com/Sharks/shark.jpg",
				"http://i.telegraph.co.uk/multimedia/archive/01515/shark_1515908c.jpg",
				"http://3.bp.blogspot.com/-r9Bixe-CZCw/T7J0GVLeydI/AAAAAAAAAeE/2mXTelVLWjQ/s1600/sharks.jpg",
				"http://3.bp.blogspot.com/-PLSTmLHxQQk/TWLFAB6K4cI/AAAAAAAAADo/hXZXfkma8uU/s1600/sharks_june08_2.jpg",
				"http://4.bp.blogspot.com/-Q_DhPXQtTvQ/TqBcBGf09tI/AAAAAAAAQdw/9uw2EqNjgvQ/s400/Great-White-Shark_500.jpg",
				"http://2.bp.blogspot.com/-zCcQ4sURNSQ/TqBcDsddlrI/AAAAAAAAQeA/sPqD7BcQcm4/s400/Shark.jpg",
				"http://imgs.sfgate.com/c/pictures/2008/05/31/mn-sharks01_ph_496667600.jpg",
				"http://njscuba.net/zzz_biology/sharks_bull_shark.jpg",
				"http://www.lifeinflux.com/daa/BullShark.jpg",
				"http://images.nationalgeographic.com/wpf/media-live/photos/000/007/cache/bull-shark_769_600x450.jpg",
				"http://planetgreen.discovery.com/feature/basking-shark.jpg",
				"http://kidzcoolzone.com/wp-content/uploads/2011/03/Shortfin-Mako-Shark.jpg",
				"http://static.guim.co.uk/sys-images/Guardian/Pix/pictures/2008/02/17/shark10d.jpg",
				"http://static.guim.co.uk/sys-images/Guardian/Pix/pictures/2009/6/23/1245751327635/Threatening-Great-white-s-001.jpg",
				"http://www.thedorsalfin.com/wp-content/uploads/2011/05/male-great-white-shark-at-surface.jpg",
				"http://images.watoday.com.au/2011/02/25/2202899/article_bull-shark2-420x0.jpg",
				"http://www.csmonitor.com/var/ezflow_site/storage/images/media/images/0609-sharks-smell-in-stereo/8100755-1-eng-US/0609-sharks-smell-in-stereo_full_600.jpg",
				"http://images.pictureshunt.com/pics/g/giant_hammerhead_shark-13966.jpg",
				"http://www.thedorsalfin.com/wp-content/uploads/2009/08/great_white_shark.jpg",
				"http://www.csmonitor.com/var/ezflow_site/storage/images/media/content/2012/0103-hybrid-shark-australia/11353434-1-eng-US/0103-hybrid-shark-australia_full_600.jpg",
				"http://www.minkler-photo-gallery.com/images/pictures-of-sharks-side-view.jpg",
				"http://www.minkler-photo-gallery.com/images/pictures-of-sharks-face-to-face.jpg",
				"http://3.bp.blogspot.com/-qFi5ouVx868/TwZ36oxrGtI/AAAAAAAACJI/wN8nrHnlSM4/s1600/Blacktip-Shark.jpg",
				"http://images1.fanpop.com/images/photos/2000000/Great-White-Shark-sharks-2025142-640-480.jpg"
				
		
			
		
		};
		int i=0;
		List<Picture> pictures=new ArrayList<Picture>();
		for (int j=0;j<url.length;j++){
			try {
				Log.i("hellodinos",url[j]);
				Picture p = new Picture(j+i, url[j],Picture.getPictureThumbnail(url[j]));
				pictures.add(p);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		DatabaseHelper.connect(this).putPictures(pictures);
	}


}
