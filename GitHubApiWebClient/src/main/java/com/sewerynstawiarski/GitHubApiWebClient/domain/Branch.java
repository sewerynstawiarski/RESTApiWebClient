package com.sewerynstawiarski.GitHubApiWebClient.domain;

import lombok.Builder;

@Builder
public record Branch(String name, Commit commit) {}
