package ra.ss09.model;


import java.util.Date;

public class Schedule {
    private Long id;
    private Long movieId;
    private Date showTime;
    private Long screenRoomId;
    private Integer availableSeats;
    private String format;

   public Schedule() {
   }
   public Long getId() {
       return id;
   }
   public void setId(Long id) {
       this.id = id;
   }
   public Long getMovieId() {
       return movieId;
   }
   public void setMovieId(Long movieId) {
       this.movieId = movieId;
   }

   public Long getScreenRoomId() {
       return screenRoomId;
   }
   public void setScreenRoomId(Long screenRoomId) {
       this.screenRoomId = screenRoomId;
   }
   public Integer getAvailableSeats() {
       return availableSeats;
   }
   public void setAvailableSeats(Integer availableSeats) {
       this.availableSeats = availableSeats;
   }
   public String getFormat() {
       return format;
   }
   public void setFormat(String format) {
       this.format = format;
   }

    public void setShowTime(Date showTime) {
        this.showTime = showTime;
    }
}
