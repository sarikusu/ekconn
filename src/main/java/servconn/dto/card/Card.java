
package servconn.dto.card;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Card {

    @Expose
    private String CardId;
    @Expose
    private String CardName;
    @Expose
    private String Cost;
    @Expose
    private String Color;
    @Expose
    private String Race;
    @Expose
    private String Attack;
    @Expose
    private String Wait;
    @Expose
    private String Skill;
    @Expose
    private String LockSkill1;
    @Expose
    private String LockSkill2;
    @Expose
    private String ImageId;
    @Expose
    private String FullImageId;
    @Expose
    private String Price;
    @Expose
    private String BaseExp;
    @Expose
    private String MaxInDeck;
    @Expose
    private String SeniorPacket;
    @Expose
    private String MasterPacket;
    @Expose
    private String Maze;
    @Expose
    private String Robber;
    @Expose
    private String MagicCard;
    @Expose
    private String Boss;
    @Expose
    private String BossCounter;
    @Expose
    private String FactionCounter;
    @Expose
    private String Glory;
    @Expose
    private String FightMPacket;
    @Expose
    private String BigYearPacket;
    @Expose
    private String BigYearPacketRoll;
    @Expose
    private String StandardPacket;
    @Expose
    private String StandardPacketRoll;
    @Expose
    private String GuruPacket;
    @Expose
    private String GuruPacketRoll;
    @Expose
    private String ActivityRobber;
    @Expose
    private String ForceFightAuction;
    @Expose
    private String ForceAuctionInitPrice;
    @Expose
    private String ForceFightExchange;
    @Expose
    private String ForceExchangeInitPrice;
    @Expose
    private String IcePacket;
    @Expose
    private String ForestPacket;
    @Expose
    private String SwampPacket;
    @Expose
    private String VolcanoPacket;
    @Expose
    private String IcePacketRoll;
    @Expose
    private String ForestPacketRoll;
    @Expose
    private String SwampPacketRoll;
    @Expose
    private String VolcanoPacketRoll;
    @Expose
    private String CanDecompose;
    @Expose
    private String Rank;
    @Expose
    private String Fragment;
    @Expose
    private String ComposePrice;
    @Expose
    private String DecomposeGet;
    @Expose
    private String ThieveChipWeight;
    @Expose
    private String MazeChipWeight;
    @Expose
    private String CanEvo;
    @Expose
    private String KeyCard;
    @Expose
    private String LeagueWeight;
    @Expose
    private String LeaguePoint;
    @Expose
    private List<Integer> HpArray = new ArrayList<Integer>();
    @Expose
    private List<Integer> AttackArray = new ArrayList<Integer>();
    @Expose
    private List<String> ExpArray = new ArrayList<String>();

    /**
     * 
     * @return
     *     The CardId
     */
    public String getCardId() {
        return CardId;
    }

    /**
     * 
     * @param CardId
     *     The CardId
     */
    public void setCardId(String CardId) {
        this.CardId = CardId;
    }

    /**
     * 
     * @return
     *     The CardName
     */
    public String getCardName() {
        return CardName;
    }

    /**
     * 
     * @param CardName
     *     The CardName
     */
    public void setCardName(String CardName) {
        this.CardName = CardName;
    }

    /**
     * 
     * @return
     *     The Cost
     */
    public String getCost() {
        return Cost;
    }

    /**
     * 
     * @param Cost
     *     The Cost
     */
    public void setCost(String Cost) {
        this.Cost = Cost;
    }

    /**
     * 
     * @return
     *     The Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * 
     * @param Color
     *     The Color
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * 
     * @return
     *     The Race
     */
    public String getRace() {
        return Race;
    }

    /**
     * 
     * @param Race
     *     The Race
     */
    public void setRace(String Race) {
        this.Race = Race;
    }

    /**
     * 
     * @return
     *     The Attack
     */
    public String getAttack() {
        return Attack;
    }

    /**
     * 
     * @param Attack
     *     The Attack
     */
    public void setAttack(String Attack) {
        this.Attack = Attack;
    }

    /**
     * 
     * @return
     *     The Wait
     */
    public String getWait() {
        return Wait;
    }

    /**
     * 
     * @param Wait
     *     The Wait
     */
    public void setWait(String Wait) {
        this.Wait = Wait;
    }

    /**
     * 
     * @return
     *     The Skill
     */
    public String getSkill() {
        return Skill;
    }

    /**
     * 
     * @param Skill
     *     The Skill
     */
    public void setSkill(String Skill) {
        this.Skill = Skill;
    }

    /**
     * 
     * @return
     *     The LockSkill1
     */
    public String getLockSkill1() {
        return LockSkill1;
    }

    /**
     * 
     * @param LockSkill1
     *     The LockSkill1
     */
    public void setLockSkill1(String LockSkill1) {
        this.LockSkill1 = LockSkill1;
    }

    /**
     * 
     * @return
     *     The LockSkill2
     */
    public String getLockSkill2() {
        return LockSkill2;
    }

    /**
     * 
     * @param LockSkill2
     *     The LockSkill2
     */
    public void setLockSkill2(String LockSkill2) {
        this.LockSkill2 = LockSkill2;
    }

    /**
     * 
     * @return
     *     The ImageId
     */
    public String getImageId() {
        return ImageId;
    }

    /**
     * 
     * @param ImageId
     *     The ImageId
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * 
     * @return
     *     The FullImageId
     */
    public String getFullImageId() {
        return FullImageId;
    }

    /**
     * 
     * @param FullImageId
     *     The FullImageId
     */
    public void setFullImageId(String FullImageId) {
        this.FullImageId = FullImageId;
    }

    /**
     * 
     * @return
     *     The Price
     */
    public String getPrice() {
        return Price;
    }

    /**
     * 
     * @param Price
     *     The Price
     */
    public void setPrice(String Price) {
        this.Price = Price;
    }

    /**
     * 
     * @return
     *     The BaseExp
     */
    public String getBaseExp() {
        return BaseExp;
    }

    /**
     * 
     * @param BaseExp
     *     The BaseExp
     */
    public void setBaseExp(String BaseExp) {
        this.BaseExp = BaseExp;
    }

    /**
     * 
     * @return
     *     The MaxInDeck
     */
    public String getMaxInDeck() {
        return MaxInDeck;
    }

    /**
     * 
     * @param MaxInDeck
     *     The MaxInDeck
     */
    public void setMaxInDeck(String MaxInDeck) {
        this.MaxInDeck = MaxInDeck;
    }

    /**
     * 
     * @return
     *     The SeniorPacket
     */
    public String getSeniorPacket() {
        return SeniorPacket;
    }

    /**
     * 
     * @param SeniorPacket
     *     The SeniorPacket
     */
    public void setSeniorPacket(String SeniorPacket) {
        this.SeniorPacket = SeniorPacket;
    }

    /**
     * 
     * @return
     *     The MasterPacket
     */
    public String getMasterPacket() {
        return MasterPacket;
    }

    /**
     * 
     * @param MasterPacket
     *     The MasterPacket
     */
    public void setMasterPacket(String MasterPacket) {
        this.MasterPacket = MasterPacket;
    }

    /**
     * 
     * @return
     *     The Maze
     */
    public String getMaze() {
        return Maze;
    }

    /**
     * 
     * @param Maze
     *     The Maze
     */
    public void setMaze(String Maze) {
        this.Maze = Maze;
    }

    /**
     * 
     * @return
     *     The Robber
     */
    public String getRobber() {
        return Robber;
    }

    /**
     * 
     * @param Robber
     *     The Robber
     */
    public void setRobber(String Robber) {
        this.Robber = Robber;
    }

    /**
     * 
     * @return
     *     The MagicCard
     */
    public String getMagicCard() {
        return MagicCard;
    }

    /**
     * 
     * @param MagicCard
     *     The MagicCard
     */
    public void setMagicCard(String MagicCard) {
        this.MagicCard = MagicCard;
    }

    /**
     * 
     * @return
     *     The Boss
     */
    public String getBoss() {
        return Boss;
    }

    /**
     * 
     * @param Boss
     *     The Boss
     */
    public void setBoss(String Boss) {
        this.Boss = Boss;
    }

    /**
     * 
     * @return
     *     The BossCounter
     */
    public String getBossCounter() {
        return BossCounter;
    }

    /**
     * 
     * @param BossCounter
     *     The BossCounter
     */
    public void setBossCounter(String BossCounter) {
        this.BossCounter = BossCounter;
    }

    /**
     * 
     * @return
     *     The FactionCounter
     */
    public String getFactionCounter() {
        return FactionCounter;
    }

    /**
     * 
     * @param FactionCounter
     *     The FactionCounter
     */
    public void setFactionCounter(String FactionCounter) {
        this.FactionCounter = FactionCounter;
    }

    /**
     * 
     * @return
     *     The Glory
     */
    public String getGlory() {
        return Glory;
    }

    /**
     * 
     * @param Glory
     *     The Glory
     */
    public void setGlory(String Glory) {
        this.Glory = Glory;
    }

    /**
     * 
     * @return
     *     The FightMPacket
     */
    public String getFightMPacket() {
        return FightMPacket;
    }

    /**
     * 
     * @param FightMPacket
     *     The FightMPacket
     */
    public void setFightMPacket(String FightMPacket) {
        this.FightMPacket = FightMPacket;
    }

    /**
     * 
     * @return
     *     The BigYearPacket
     */
    public String getBigYearPacket() {
        return BigYearPacket;
    }

    /**
     * 
     * @param BigYearPacket
     *     The BigYearPacket
     */
    public void setBigYearPacket(String BigYearPacket) {
        this.BigYearPacket = BigYearPacket;
    }

    /**
     * 
     * @return
     *     The BigYearPacketRoll
     */
    public String getBigYearPacketRoll() {
        return BigYearPacketRoll;
    }

    /**
     * 
     * @param BigYearPacketRoll
     *     The BigYearPacketRoll
     */
    public void setBigYearPacketRoll(String BigYearPacketRoll) {
        this.BigYearPacketRoll = BigYearPacketRoll;
    }

    /**
     * 
     * @return
     *     The StandardPacket
     */
    public String getStandardPacket() {
        return StandardPacket;
    }

    /**
     * 
     * @param StandardPacket
     *     The StandardPacket
     */
    public void setStandardPacket(String StandardPacket) {
        this.StandardPacket = StandardPacket;
    }

    /**
     * 
     * @return
     *     The StandardPacketRoll
     */
    public String getStandardPacketRoll() {
        return StandardPacketRoll;
    }

    /**
     * 
     * @param StandardPacketRoll
     *     The StandardPacketRoll
     */
    public void setStandardPacketRoll(String StandardPacketRoll) {
        this.StandardPacketRoll = StandardPacketRoll;
    }

    /**
     * 
     * @return
     *     The GuruPacket
     */
    public String getGuruPacket() {
        return GuruPacket;
    }

    /**
     * 
     * @param GuruPacket
     *     The GuruPacket
     */
    public void setGuruPacket(String GuruPacket) {
        this.GuruPacket = GuruPacket;
    }

    /**
     * 
     * @return
     *     The GuruPacketRoll
     */
    public String getGuruPacketRoll() {
        return GuruPacketRoll;
    }

    /**
     * 
     * @param GuruPacketRoll
     *     The GuruPacketRoll
     */
    public void setGuruPacketRoll(String GuruPacketRoll) {
        this.GuruPacketRoll = GuruPacketRoll;
    }

    /**
     * 
     * @return
     *     The ActivityRobber
     */
    public String getActivityRobber() {
        return ActivityRobber;
    }

    /**
     * 
     * @param ActivityRobber
     *     The ActivityRobber
     */
    public void setActivityRobber(String ActivityRobber) {
        this.ActivityRobber = ActivityRobber;
    }

    /**
     * 
     * @return
     *     The ForceFightAuction
     */
    public String getForceFightAuction() {
        return ForceFightAuction;
    }

    /**
     * 
     * @param ForceFightAuction
     *     The ForceFightAuction
     */
    public void setForceFightAuction(String ForceFightAuction) {
        this.ForceFightAuction = ForceFightAuction;
    }

    /**
     * 
     * @return
     *     The ForceAuctionInitPrice
     */
    public String getForceAuctionInitPrice() {
        return ForceAuctionInitPrice;
    }

    /**
     * 
     * @param ForceAuctionInitPrice
     *     The ForceAuctionInitPrice
     */
    public void setForceAuctionInitPrice(String ForceAuctionInitPrice) {
        this.ForceAuctionInitPrice = ForceAuctionInitPrice;
    }

    /**
     * 
     * @return
     *     The ForceFightExchange
     */
    public String getForceFightExchange() {
        return ForceFightExchange;
    }

    /**
     * 
     * @param ForceFightExchange
     *     The ForceFightExchange
     */
    public void setForceFightExchange(String ForceFightExchange) {
        this.ForceFightExchange = ForceFightExchange;
    }

    /**
     * 
     * @return
     *     The ForceExchangeInitPrice
     */
    public String getForceExchangeInitPrice() {
        return ForceExchangeInitPrice;
    }

    /**
     * 
     * @param ForceExchangeInitPrice
     *     The ForceExchangeInitPrice
     */
    public void setForceExchangeInitPrice(String ForceExchangeInitPrice) {
        this.ForceExchangeInitPrice = ForceExchangeInitPrice;
    }

    /**
     * 
     * @return
     *     The IcePacket
     */
    public String getIcePacket() {
        return IcePacket;
    }

    /**
     * 
     * @param IcePacket
     *     The IcePacket
     */
    public void setIcePacket(String IcePacket) {
        this.IcePacket = IcePacket;
    }

    /**
     * 
     * @return
     *     The ForestPacket
     */
    public String getForestPacket() {
        return ForestPacket;
    }

    /**
     * 
     * @param ForestPacket
     *     The ForestPacket
     */
    public void setForestPacket(String ForestPacket) {
        this.ForestPacket = ForestPacket;
    }

    /**
     * 
     * @return
     *     The SwampPacket
     */
    public String getSwampPacket() {
        return SwampPacket;
    }

    /**
     * 
     * @param SwampPacket
     *     The SwampPacket
     */
    public void setSwampPacket(String SwampPacket) {
        this.SwampPacket = SwampPacket;
    }

    /**
     * 
     * @return
     *     The VolcanoPacket
     */
    public String getVolcanoPacket() {
        return VolcanoPacket;
    }

    /**
     * 
     * @param VolcanoPacket
     *     The VolcanoPacket
     */
    public void setVolcanoPacket(String VolcanoPacket) {
        this.VolcanoPacket = VolcanoPacket;
    }

    /**
     * 
     * @return
     *     The IcePacketRoll
     */
    public String getIcePacketRoll() {
        return IcePacketRoll;
    }

    /**
     * 
     * @param IcePacketRoll
     *     The IcePacketRoll
     */
    public void setIcePacketRoll(String IcePacketRoll) {
        this.IcePacketRoll = IcePacketRoll;
    }

    /**
     * 
     * @return
     *     The ForestPacketRoll
     */
    public String getForestPacketRoll() {
        return ForestPacketRoll;
    }

    /**
     * 
     * @param ForestPacketRoll
     *     The ForestPacketRoll
     */
    public void setForestPacketRoll(String ForestPacketRoll) {
        this.ForestPacketRoll = ForestPacketRoll;
    }

    /**
     * 
     * @return
     *     The SwampPacketRoll
     */
    public String getSwampPacketRoll() {
        return SwampPacketRoll;
    }

    /**
     * 
     * @param SwampPacketRoll
     *     The SwampPacketRoll
     */
    public void setSwampPacketRoll(String SwampPacketRoll) {
        this.SwampPacketRoll = SwampPacketRoll;
    }

    /**
     * 
     * @return
     *     The VolcanoPacketRoll
     */
    public String getVolcanoPacketRoll() {
        return VolcanoPacketRoll;
    }

    /**
     * 
     * @param VolcanoPacketRoll
     *     The VolcanoPacketRoll
     */
    public void setVolcanoPacketRoll(String VolcanoPacketRoll) {
        this.VolcanoPacketRoll = VolcanoPacketRoll;
    }

    /**
     * 
     * @return
     *     The CanDecompose
     */
    public String getCanDecompose() {
        return CanDecompose;
    }

    /**
     * 
     * @param CanDecompose
     *     The CanDecompose
     */
    public void setCanDecompose(String CanDecompose) {
        this.CanDecompose = CanDecompose;
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
     *     The Fragment
     */
    public String getFragment() {
        return Fragment;
    }

    /**
     * 
     * @param Fragment
     *     The Fragment
     */
    public void setFragment(String Fragment) {
        this.Fragment = Fragment;
    }

    /**
     * 
     * @return
     *     The ComposePrice
     */
    public String getComposePrice() {
        return ComposePrice;
    }

    /**
     * 
     * @param ComposePrice
     *     The ComposePrice
     */
    public void setComposePrice(String ComposePrice) {
        this.ComposePrice = ComposePrice;
    }

    /**
     * 
     * @return
     *     The DecomposeGet
     */
    public String getDecomposeGet() {
        return DecomposeGet;
    }

    /**
     * 
     * @param DecomposeGet
     *     The DecomposeGet
     */
    public void setDecomposeGet(String DecomposeGet) {
        this.DecomposeGet = DecomposeGet;
    }

    /**
     * 
     * @return
     *     The ThieveChipWeight
     */
    public String getThieveChipWeight() {
        return ThieveChipWeight;
    }

    /**
     * 
     * @param ThieveChipWeight
     *     The ThieveChipWeight
     */
    public void setThieveChipWeight(String ThieveChipWeight) {
        this.ThieveChipWeight = ThieveChipWeight;
    }

    /**
     * 
     * @return
     *     The MazeChipWeight
     */
    public String getMazeChipWeight() {
        return MazeChipWeight;
    }

    /**
     * 
     * @param MazeChipWeight
     *     The MazeChipWeight
     */
    public void setMazeChipWeight(String MazeChipWeight) {
        this.MazeChipWeight = MazeChipWeight;
    }

    /**
     * 
     * @return
     *     The CanEvo
     */
    public String getCanEvo() {
        return CanEvo;
    }

    /**
     * 
     * @param CanEvo
     *     The CanEvo
     */
    public void setCanEvo(String CanEvo) {
        this.CanEvo = CanEvo;
    }

    /**
     * 
     * @return
     *     The KeyCard
     */
    public String getKeyCard() {
        return KeyCard;
    }

    /**
     * 
     * @param KeyCard
     *     The KeyCard
     */
    public void setKeyCard(String KeyCard) {
        this.KeyCard = KeyCard;
    }

    /**
     * 
     * @return
     *     The LeagueWeight
     */
    public String getLeagueWeight() {
        return LeagueWeight;
    }

    /**
     * 
     * @param LeagueWeight
     *     The LeagueWeight
     */
    public void setLeagueWeight(String LeagueWeight) {
        this.LeagueWeight = LeagueWeight;
    }

    /**
     * 
     * @return
     *     The LeaguePoint
     */
    public String getLeaguePoint() {
        return LeaguePoint;
    }

    /**
     * 
     * @param LeaguePoint
     *     The LeaguePoint
     */
    public void setLeaguePoint(String LeaguePoint) {
        this.LeaguePoint = LeaguePoint;
    }

    /**
     * 
     * @return
     *     The HpArray
     */
    public List<Integer> getHpArray() {
        return HpArray;
    }

    /**
     * 
     * @param HpArray
     *     The HpArray
     */
    public void setHpArray(List<Integer> HpArray) {
        this.HpArray = HpArray;
    }

    /**
     * 
     * @return
     *     The AttackArray
     */
    public List<Integer> getAttackArray() {
        return AttackArray;
    }

    /**
     * 
     * @param AttackArray
     *     The AttackArray
     */
    public void setAttackArray(List<Integer> AttackArray) {
        this.AttackArray = AttackArray;
    }

    /**
     * 
     * @return
     *     The ExpArray
     */
    public List<String> getExpArray() {
        return ExpArray;
    }

    /**
     * 
     * @param ExpArray
     *     The ExpArray
     */
    public void setExpArray(List<String> ExpArray) {
        this.ExpArray = ExpArray;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
