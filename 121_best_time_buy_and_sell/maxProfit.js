var maxProfit = function (prices) {
  if (prices === null || prices.length === 0) {
    return 0;
  }
  let profit = 0;
  let minPrice = prices[0];
  prices.forEach((element) => {
    profit = Math.max(profit, element - minPrice);
    minPrice = Math.min(minPrice, element);
  });
  return profit;
};
