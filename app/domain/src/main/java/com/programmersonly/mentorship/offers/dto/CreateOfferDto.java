package com.programmersonly.mentorship.offers.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;


@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CreateOfferDto {

    private UUID ownerId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;


}
