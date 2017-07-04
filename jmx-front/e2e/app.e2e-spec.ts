import { JmxFrontPage } from './app.po';

describe('jmx-front App', () => {
  let page: JmxFrontPage;

  beforeEach(() => {
    page = new JmxFrontPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!!');
  });
});
