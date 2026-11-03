package com.olga.board;

import java.time.Instant;

public class AuctionBoard {

    public record AuctionView(String auctionId, String title, String status, String leader,
                              String price, int bids, boolean reserveMet, int extensions, Instant endsAt) {}
}
