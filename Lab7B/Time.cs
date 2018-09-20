public class Time : object
{
   private int hour;
   private int minute;
   private int second;


   public Time()
   {
	  setTime(0, 0, 0);
   }

   public Time(int h)
   {
	  setTime(h, 0, 0);
   }

   public Time(int h, int m)
   {
	  setTime(h, m, 0);
   }

   public Time(int h, int m, int s)
   {
	  setTime(h, m, s);
   }

   public Time(Time time)
   {
	  setTime(time.Hour, time.Minute, time.Second);
   }

   public virtual bool setTime(int h, int m, int s)
   {
	  if (h < 0 && h > 24)
	  {
		  h = 0;
	  }
	  if (m < 0 && h > 60)
	  {
		  m = 0;
	  }
	  if (s < 0 && h > 60)
	  {
		  s = 0;
	  }
	  this.hour = h;
	  this.minute = m;
	  this.second = s;
	  return true;
   }

   public virtual bool setHour(int h)
   {
	 if (h < 0 && h > 24)
	 {
		 h = 0;
	 }
	 this.hour = h;
	   return false;
   }

   public virtual bool setMinute(int m)
   {
	 if (m < 0 && m > 24)
	 {
		 m = 0;
	 }
	 this.minute = m;
	   return false;
   }

   public virtual bool setSecond(int s)
   {
	 if (s < 0 && s > 24)
	 {
		 s = 0;
	 }
	 this.second = s;
	   return false;
   }

   public virtual int Hour
   {
	   get
	   {
		  return hour;
	   }
   }

   public virtual int Minute
   {
	   get
	   {
		  return minute;
	   }
   }

   public virtual int Second
   {
	   get
	   {
		  return second;
	   }
   }

   public virtual string toUniversalString()
   {
	  DecimalFormat twoDigits = new DecimalFormat("00");

	  return twoDigits.format(Hour) + ":" + twoDigits.format(Minute) + ":" + twoDigits.format(Second);
   }

   public override string ToString()
   {
	  DecimalFormat twoDigits = new DecimalFormat("00");

	  return ((Hour == 12 || Hour == 0) ? 12 : Hour % 12) + ":" + twoDigits.format(Minute) + ":" + twoDigits.format(Second) + (Hour < 12 ? " AM" : " PM");
   }
}
