package com.huypro.JewelryAuction.entity;

public class AuctionSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "auction_session_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "staff_id", nullable = true)
    private Staff staff;

    @Column(name = "starting_bid")
    private LocalDateTime startingBid;

    @Column(name = "start_time")
    private LocalDateTime startTime;

    @Column(name = "end_time")
    private LocalDateTime endTime;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "description", length=1000)
    private String description;

    private String image;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private AuctionSessionStatus status;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "auctionSession")
    private Set<Lot> lots = new LinkedHashSet<>();
}
