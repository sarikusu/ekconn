
package servconn.dto.mapstage;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class MapStage {

    @Expose
    private String MapStageId;
    @Expose
    private String Name;
    @Expose
    private String Count;
    @Expose
    private String EverydayReward;
    @Expose
    private String Rank;
    @Expose
    private String MazeCount;
    @Expose
    private String NeedStar;
    @Expose
    private String Prev;
    @Expose
    private String Next;
    @Expose
    private List<MapStageDetail> MapStageDetails = new ArrayList<MapStageDetail>();

    /**
     * 
     * @return
     *     The MapStageId
     */
    public String getMapStageId() {
        return MapStageId;
    }

    /**
     * 
     * @param MapStageId
     *     The MapStageId
     */
    public void setMapStageId(String MapStageId) {
        this.MapStageId = MapStageId;
    }

    /**
     * 
     * @return
     *     The Name
     */
    public String getName() {
        return Name;
    }

    /**
     * 
     * @param Name
     *     The Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 
     * @return
     *     The Count
     */
    public String getCount() {
        return Count;
    }

    /**
     * 
     * @param Count
     *     The Count
     */
    public void setCount(String Count) {
        this.Count = Count;
    }

    /**
     * 
     * @return
     *     The EverydayReward
     */
    public String getEverydayReward() {
        return EverydayReward;
    }

    /**
     * 
     * @param EverydayReward
     *     The EverydayReward
     */
    public void setEverydayReward(String EverydayReward) {
        this.EverydayReward = EverydayReward;
    }

    /**
     * 
     * @return
     *     The Rank
     */
    public String getRank() {
        return Rank;
    }

    /**
     * 
     * @param Rank
     *     The Rank
     */
    public void setRank(String Rank) {
        this.Rank = Rank;
    }

    /**
     * 
     * @return
     *     The MazeCount
     */
    public String getMazeCount() {
        return MazeCount;
    }

    /**
     * 
     * @param MazeCount
     *     The MazeCount
     */
    public void setMazeCount(String MazeCount) {
        this.MazeCount = MazeCount;
    }

    /**
     * 
     * @return
     *     The NeedStar
     */
    public String getNeedStar() {
        return NeedStar;
    }

    /**
     * 
     * @param NeedStar
     *     The NeedStar
     */
    public void setNeedStar(String NeedStar) {
        this.NeedStar = NeedStar;
    }

    /**
     * 
     * @return
     *     The Prev
     */
    public String getPrev() {
        return Prev;
    }

    /**
     * 
     * @param Prev
     *     The Prev
     */
    public void setPrev(String Prev) {
        this.Prev = Prev;
    }

    /**
     * 
     * @return
     *     The Next
     */
    public String getNext() {
        return Next;
    }

    /**
     * 
     * @param Next
     *     The Next
     */
    public void setNext(String Next) {
        this.Next = Next;
    }

    /**
     * 
     * @return
     *     The MapStageDetails
     */
    public List<MapStageDetail> getMapStageDetails() {
        return MapStageDetails;
    }

    /**
     * 
     * @param MapStageDetails
     *     The MapStageDetails
     */
    public void setMapStageDetails(List<MapStageDetail> MapStageDetails) {
        this.MapStageDetails = MapStageDetails;
    }

}
